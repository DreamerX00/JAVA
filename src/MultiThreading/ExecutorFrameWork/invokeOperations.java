package MultiThreading.ExecutorFrameWork;

import java.util.List;
import java.util.concurrent.*;

public class invokeOperations {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> c1 = () -> "Calling From c1";
        Callable<String> c2 = () -> "Calling From c2";
        Callable<String> c3 = () -> "Calling From c3";
        List<Callable<String>> callables = List.of(c1,c2,c3);

        try(ExecutorService executorService = Executors.newFixedThreadPool(3)){
            List<Future<String>> future = executorService.invokeAll(callables,1, TimeUnit.SECONDS);
            future.forEach(f -> {
                try {
                    System.out.println(f.get());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            });
            executorService.shutdown();
        }
    }
}
