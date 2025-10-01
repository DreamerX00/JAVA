package MultiThreading.ExecutorFrameWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static MultiThreading.ExecutorFrameWork.Main.factorial;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SimulationOperations so = new SimulationOperations();
        so.withoutExecutor();
        System.out.println("==========================================");
        so.withExecutor();
    }

    static int factorial(int num){
        if (num <= 1) return num;
        return num * (factorial(num-1));
    }
}

class SimulationOperations{
    void withoutExecutor(){
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[10];
        for (int i = 1; i <= 10;i++){
            int finalI = i;
            threads[i-1] = new Thread(() -> System.out.println("Without Executor Factorial Of : "+ finalI +" is : "+factorial(finalI)));
            threads[i-1].start();
        }

        for(Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        long sec = (System.currentTimeMillis()-startTime) / (1000);
        long milli = (System.currentTimeMillis()-startTime) % 1000;

        System.out.println("Total Time Taken Without Executor = "+ sec + " Seconds"+ "and "+milli+" Milliseconds");
    }

    void withExecutor(){
        long startTime = System.currentTimeMillis();
        try (ExecutorService executor = Executors.newFixedThreadPool(20)) {
            for (int i = 1; i <= 10; i++) {
                int finalI = i;
                executor.submit(() -> System.out.println("With Executor Factorial Of : " + finalI + " is : " + factorial(finalI)));
                //No need to call any .start() method
            }
            //No need to join every Thread
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
        }catch (IllegalArgumentException e){
            e.getCause();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        long sec = (System.currentTimeMillis()-startTime) / (1000);
        long milli = (System.currentTimeMillis()-startTime) % 1000;

        System.out.println("Total Time Taken Without Executor = "+ sec + " Seconds"+ "and "+milli+" Milliseconds");
    }
}
