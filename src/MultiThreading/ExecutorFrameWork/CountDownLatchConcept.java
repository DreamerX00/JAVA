package MultiThreading.ExecutorFrameWork;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchConcept {
    public static void main(String[] args) throws InterruptedException {
        int no_of_services = 4;
        ExecutorService executorService = Executors.newFixedThreadPool(no_of_services);
        CountDownLatch latch = new CountDownLatch(no_of_services);
        executorService.submit(new PreConfiguredServices(latch));
        executorService.submit(new PreConfiguredServices(latch));
        executorService.submit(new PreConfiguredServices(latch));
        executorService.submit(new PreConfiguredServices(latch));

        latch.await();

        System.out.println("All Services Are Started .... "+"\nStarting Main Method");
        executorService.shutdown();
    }
}

class PreConfiguredServices implements Callable<String> {
    private final CountDownLatch latch;

    public PreConfiguredServices(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try{
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Started.. ");
        }finally {
            latch.countDown();
        }
        return "Services Started";
    }
}