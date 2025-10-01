package MultiThreading;

public class priorityOperations {
    public static void main(String[] args) throws  InterruptedException {
        System.out.println("This is priority operation in multithreading");
        PriorityWorker w1 = new PriorityWorker("Low Priority Task", Thread.MIN_PRIORITY,"Worker-1");
        PriorityWorker w2 = new PriorityWorker("Medium Priority Task", Thread.NORM_PRIORITY,"Worker-2");
        PriorityWorker w3 = new PriorityWorker("High Priority Task", Thread.MAX_PRIORITY,"Worker-3");

        System.out.println("Starting all tasks...");
        w1.start();
        w2.start();
        w3.start();

        // Wait for all threads to finish
        w1.join();
        w2.join();
        w3.join();

        System.out.println("All tasks completed.");
    }
}
class PriorityWorker extends Thread {
    private String taskName;

    public PriorityWorker(String taskName, int priority,String name) {
        super(name);
        this.taskName = taskName;
        this.setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println("Thread Name: " + this.getName());
        System.out.println("Starting task: " + taskName + " with priority " + this.getPriority());
        try {
            Thread.sleep(2000); // Simulate time-consuming task
        } catch (InterruptedException e) {
            System.out.println(taskName + " was interrupted.");
        }
        System.out.println("Completed task: " + taskName);
    }
}
