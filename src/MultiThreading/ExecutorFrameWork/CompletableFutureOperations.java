package MultiThreading.ExecutorFrameWork;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFutureOperations {
    void main() throws ExecutionException, InterruptedException {
        //Use for non-blocking Asynchronous behaviour in java
        //by default treated as daemon thread
        /*
        By default, CompletableFuture tasks often run on daemon threads due to the use of ForkJoinPool.commonPool.
        You can control the thread type by providing a custom ExecutorService.
        The CompletableFuture task itself doesn't dictate whether it's a daemon or user thread—that depends on
        the thread used by the executor.
         */

        List<SubsystemServices2> services2List = List.of(
                new SubsystemServices2("Network Connection",2000),
                new SubsystemServices2("Database Connection",2000),
                new SubsystemServices2("Bean Injection",4000)
                );
        CompletableFuture<SubsystemServices2> f1 = CompletableFuture.supplyAsync(() -> services2List.get(0));
        f1.join();
        f1.get().get();
        System.out.println("Main Thread Started...");
    }
}

class SubsystemServices2 implements Supplier<String> {
    private final String serviceName;
    private final int initializationTime;

    public SubsystemServices2(String serviceName, int initializationTime) {
        this.serviceName = serviceName;
        this.initializationTime = initializationTime;

    }

    @Override
    public String get() {
        System.out.println(Thread.currentThread().getName()+" Starting Service "+serviceName);
        try {
            Thread.sleep(initializationTime);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Initializing "+serviceName+" Service Completed");
        return "Service Started";
    }
}

