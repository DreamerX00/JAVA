package MultiThreading.ExecutorFrameWork;
import java.util.concurrent.*;

public class CallableOperations {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Runnable runnable = () -> "This Dosen't Work As Runnable Is Void";
        Callable<String> callable = () -> "This Is Better Because We Are Returned";
        try(ExecutorService executorService = Executors.newSingleThreadExecutor()){
          Future<?> future = executorService.submit(callable);
            System.out.println(future.cancel(true));
            System.out.println(future.isCancelled() ? "Task Is Cancelled" : "Unable To Cancel The executor" + future.get());
          System.out.println(future.isDone() ? "Task Is Complete" : "Task In Not Complete");
          executorService.shutdown();
        }

        //One More We Can Do is
        try(ExecutorService executorService2 = Executors.newSingleThreadExecutor()){
          Future<?> future2 = executorService2.submit(() -> System.out.println("This Work As Runnable"),"Hi From Get Method, Result is Fetched");
            System.out.println(future2.isCancelled() ? "Task Is Cancelled" : "Unable To Cancel The executor " + future2.get());
          System.out.println(future2.isDone() ? "Task Is Complete" : "Task In Not Complete");
          executorService2.shutdown();
        }
    }
}
