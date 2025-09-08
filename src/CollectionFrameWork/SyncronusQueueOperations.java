package CollectionFrameWork;

import java.util.concurrent.SynchronousQueue;

public class SyncronusQueueOperations {
    public static void main(String[] args) {
        // Implementation will be similar to BlockingQueueOperations but using SynchronousQueue
        SynchronousQueue<String> myQueue = new SynchronousQueue<>();
        new Thread(new SynchronousProducer(myQueue,"Akash ")).start();
        new Thread(new SynchronousConsumer(myQueue,"Tanisha ")).start();
        new Thread(new SynchronousConsumer(myQueue,"Rohit ")).start();
    }
}
 class SynchronousProducer implements Runnable{
    private SynchronousQueue<String> myQueue;
    private String name;

    public SynchronousProducer(SynchronousQueue<String> myQueue, String name) {
        this.myQueue = myQueue;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                String item = "Item" + i;
                myQueue.put(item);
                System.out.println(name + " produced: " + item + " at " + java.time.LocalTime.now());
                Thread.sleep(10); // Simulate time taken to produce
            }
            myQueue.put("END");
            myQueue.put("END");// Signal consumers to stop
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
            Thread.currentThread().interrupt();
        }
    }
 }
 class SynchronousConsumer implements Runnable{
    private SynchronousQueue<String> myQueue;
    private String name;

    public SynchronousConsumer(SynchronousQueue<String> myQueue, String name) {
        this.myQueue = myQueue;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while (true){
                String item = myQueue.take();
                if (item.equals("END")) {
                    break; // Exit if end signal is received
                }
                System.out.println(name + " consumed: " + item + " at " + java.time.LocalTime.now());
                Thread.sleep(4000); // Simulate time taken to consume
            }
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
            Thread.currentThread().interrupt();
        }
    }
 }

