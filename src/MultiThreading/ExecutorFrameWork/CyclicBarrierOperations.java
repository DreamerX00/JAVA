package MultiThreading.ExecutorFrameWork;

import java.util.List;
import java.util.concurrent.*;

public class CyclicBarrierOperations {
    /*Helps to create a scenario where all worker thread will execute at the same time. or they will wait until
    all worker arrives*/

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        int totalServices = 4;
        try(ExecutorService executorService = Executors.newFixedThreadPool(totalServices)){
            CyclicBarrier cyclicBarrier = new CyclicBarrier(totalServices);
            List<SubsystemServices> servicesList = List.of(
                new SubsystemServices("Network Connection",2000,cyclicBarrier),
                new SubsystemServices("Database Connection",2000,cyclicBarrier),
                new SubsystemServices("Bean Injection",4000,cyclicBarrier)
            );

            servicesList.forEach(executorService::submit);

            cyclicBarrier.await();
            executorService.shutdown();
        }catch (InterruptedException _){
            Thread.currentThread().interrupt();
        }


        System.out.println("All Services Started \nNow Executing Main Thread......");

    }



}

class SubsystemServices implements Callable<String>{
    private final String serviceName;
    private final int initializationTime;
    private final CyclicBarrier barrier;

    public SubsystemServices(String serviceName, int initializationTime, CyclicBarrier barrier) {
        this.serviceName = serviceName;
        this.initializationTime = initializationTime;
        this.barrier = barrier;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" Starting Service "+serviceName);
        Thread.sleep(initializationTime);
        System.out.println("Initializing "+serviceName+" Service Completed");
        barrier.await();
        return "Service Started";
    }
}
