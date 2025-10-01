package MultiThreading.ExecutorFrameWork;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureOperations {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try(ExecutorService executor = Executors.newSingleThreadExecutor()) {
            Future<String> future = executor.submit(() -> "Hi This is Executor Service");
            System.out.println(future.get());
            if (future.isDone()) System.out.println("Task is Done!!");
            executor.shutdown();
        }
    }
}
