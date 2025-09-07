
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueOperations {
    public static void main(String[] args) {
        BlockingQueue<String> myQueue = new ArrayBlockingQueue<>(10);
        new Producer(myQueue,"Akash ").start();
        new Consumer(myQueue,"Tanisha ").start();
    }
}

class Producer extends Thread{
    private BlockingQueue<String> myQueue;
    private String name;

    public Producer(BlockingQueue<String> myQueue, String name) {
        this.myQueue = myQueue;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                String item = " Item " + i;
                myQueue.put(item);
                System.out.println(name + " produced: " + item);
                Thread.sleep(1000); // Simulate time taken to produce
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer extends Thread{
    private BlockingQueue<String> myQueue;
    private String name;

    public Consumer(BlockingQueue<String> myQueue, String name) {
        this.myQueue = myQueue;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; !myQueue.isEmpty(); i++) {
            try {
                String item = myQueue.poll();
                System.out.println(name + " consumed: " + item);
                Thread.sleep(2000); // Simulate time taken to consume
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
                Thread.currentThread().interrupt();
            }
        }
    }
}
