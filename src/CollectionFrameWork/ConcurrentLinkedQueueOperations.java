package CollectionFrameWork;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueOperations {
    public static void main(String[] args) throws InterruptedException {
        // Implementation will be similar to BlockingQueueOperations but using ConcurrentLinkedQueue
        ConcurrentLinkedQueue<String> myQueue = new ConcurrentLinkedQueue<>();
        new Thread(new ConcurrentLinkedProducer(myQueue,"Akash ")).start();
        Thread.sleep(2000);
        new Thread(new ConcurrentLinkedConsumer(myQueue,"Tanisha ")).start();
        new Thread(new ConcurrentLinkedConsumer(myQueue,"Rohit ")).start();
        new Thread(new ConcurrentLinkedProducer(myQueue,"Ankita ")).start();
        new Thread(new ConcurrentLinkedProducer(myQueue,"Ankit ")).start();

    }
}
class ConcurrentLinkedConsumer implements  Runnable{
    private ConcurrentLinkedQueue<String> myQueue;
    private String name;

    public ConcurrentLinkedConsumer(ConcurrentLinkedQueue<String> myQueue, String name) {
        this.myQueue = myQueue;
        this.name = name;
    }

    @Override
    public void run() {
            try {
                while (true){
                    String item = myQueue.poll();
                    if (item.equals("END")) {
                        break; // Exit if end signal is received
                    }
                    System.out.println(name + " consumed: " + item);
                    Thread.sleep(4000); // Simulate time taken to consumer
                }
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
                Thread.currentThread().interrupt();
            }
    }
}
class ConcurrentLinkedProducer implements Runnable{
    private ConcurrentLinkedQueue<String> myQueue;
    private String name;

    public ConcurrentLinkedProducer(ConcurrentLinkedQueue<String> myQueue, String name) {
        this.myQueue = myQueue;
        this.name = name;
    }

    @Override
    public void run() {
            try {
            for (int i = 0; i < 10; i++) {
                String item = " Item " + i;
                myQueue.add(item);
                System.out.println(name + " produced: " + item);
                Thread.sleep(10); // Simulate time taken to produce
            }
            myQueue.add("END"); // Signal consumers to stop
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
                Thread.currentThread().interrupt();
            }
    }
}