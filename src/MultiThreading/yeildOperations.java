package MultiThreading;

public class yeildOperations {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("This is yeild operation in multithreading");
        YieldWorker w1 = new YieldWorker("Task 1","Worker-1");
        YieldWorker w2 = new YieldWorker("Task 2","Worker-2");
        YieldWorker w3 = new YieldWorker("Task 3","Worker-3");

        System.out.println("Starting all tasks...");
        w1.start();
        w2.start();
        w3.start();
    }
}
class YieldWorker extends Thread {
    private String taskName;

    public YieldWorker(String taskName,String name) {
        super(name);
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Thread Name: " + this.getName());
        for (int i = 0; i < 5; i++) {
            System.out.println("Executing " + taskName + " - Step " + (i + 1));
            if (i == 2) { // Yield after the third step
                System.out.println(taskName + " is yielding...");
                Thread.yield();
            }
            try {
                Thread.sleep(500); // Simulate time-consuming task
            } catch (InterruptedException e) {
                System.out.println(taskName + " was interrupted.");
            }
        }
        System.out.println("Completed task: " + taskName);
    }
}
