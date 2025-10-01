package MultiThreading;

public class DaemonOperations {
    public static void main(String[] args) {
        System.out.println("This is Daemon operation in multithreading");
        DaemonWorker w1 = new DaemonWorker("Background Task 1","Worker-1",500);
        DaemonWorker w2 = new DaemonWorker("Background Task 2","Worker-2",700);
        DaemonWorker w3 = new DaemonWorker("User Task","Worker-3",200);

        w1.setDaemon(true);
        w2.setDaemon(true);
        // w3.setDaemon(true); // Uncommenting this line will make w3 a daemon thread

        System.out.println("Starting all tasks...");
        w1.start();
        w2.start();
        w3.start();

        try {
            Thread.sleep(3000); // Main thread sleeps for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class DaemonWorker extends Thread {
    private String taskName;
    private int sleepTime;
    public DaemonWorker(String taskName,String name, int sleepTime) {
        super(name);
        this.taskName = taskName;
        this.sleepTime = sleepTime;
    }
    @Override
    public void run() {
        System.out.println("Thread Name: " + this.getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("Executing " + taskName + " - Step " + (i + 1));
            try {
                Thread.sleep(sleepTime); // Simulate time-consuming task
            } catch (InterruptedException e) {
                System.out.println(taskName + " was interrupted.");
            }
        }
        System.out.println("Completed task: " + taskName);
    }
}
