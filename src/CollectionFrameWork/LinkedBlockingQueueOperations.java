package CollectionFrameWork;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueOperations {
    public static void main(String[] args) {
        // Implementation will be similar to BlockingQueueOperations but using LinkedBlockingQueue
        LinkedBlockingQueue<String> myQueue = new LinkedBlockingQueue<>();
        new Thread(new LinkedProducer(myQueue,"Akash ")).start();
        new Thread(new LinkedConsumer(myQueue,"Tanisha ")).start();
        new Thread(new LinkedConsumer(myQueue,"Rohit ")).start();
    }
}

class LinkedConsumer implements  Runnable{
    private LinkedBlockingQueue<String> myQueue;
    private String name;

    public LinkedConsumer(LinkedBlockingQueue<String> myQueue, String name) {
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
                    System.out.println(name + " consumed: " + item);
                    Thread.sleep(4000); // Simulate time taken to consum
                }
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
                Thread.currentThread().interrupt();
            }
    }
}
class LinkedProducer implements Runnable{
    private LinkedBlockingQueue<String> myQueue;
    private String name;

    public LinkedProducer(LinkedBlockingQueue<String> myQueue, String name) {
        this.myQueue = myQueue;
        this.name = name;
    }

    @Override
    public void run() {
            try {
            for (int i = 0; i < 10; i++) {
                String item = " Item " + i;
                myQueue.put(item);
                System.out.println(name + " produced: " + item);
                Thread.sleep(10); // Simulate time taken to produce
            }
            myQueue.put("END"); // Signal consumers to stop
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
                Thread.currentThread().interrupt();
            }
    }
}
