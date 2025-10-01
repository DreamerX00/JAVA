package MultiThreading;

public class joinOperations {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("This is join operation in multithreading");
        Worker w1 = new Worker("Wake Up");
        Worker w2 = new Worker("Brush Teeth");
        Worker w3 = new Worker("Take Bath");
        Worker w4 = new Worker("Have Breakfast");
        Worker w5 = new Worker("Go to Work");

        System.out.println("Starting all tasks...");
        w1.start();
        w1.join();

        w2.start();
        w2.join();

        w3.start();
        w3.join();

        w4.start();
        w4.join();

        w5.start();
        w5.join();

        System.out.println("All tasks completed.");

    }
}
class Worker extends Thread{
    private String task;
    public Worker(String task){
        this.task = task;
    }
    @Override
    public void run(){
        System.out.println("Starting task: " + task);
        try {
            Thread.sleep(2000); // Simulate time-consuming task
        } catch (InterruptedException e) {
            System.out.println(task + " was interrupted.");
        }
        System.out.println("Completed task: " + task);
    }
}
