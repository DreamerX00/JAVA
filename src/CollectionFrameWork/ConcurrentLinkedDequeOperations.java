package CollectionFrameWork;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeOperations {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
        new Thread(new ConcurrentLinkedDequeProducer(concurrentLinkedDeque,"Akash ","Start")).start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        new Thread(new ConcurrentLinkedDequeConsumer(concurrentLinkedDeque,"Tanisha ","Start")).start();
        new Thread(new ConcurrentLinkedDequeConsumer(concurrentLinkedDeque,"Rohit ","End")).start();
        new Thread(new ConcurrentLinkedDequeProducer(concurrentLinkedDeque,"Ankita ","End")).start();
        new Thread(new ConcurrentLinkedDequeProducer(concurrentLinkedDeque,"Ankit ","End")).start();

    }
}

class ConcurrentLinkedDequeConsumer implements  Runnable{
    private final ConcurrentLinkedDeque<String> myQueue;
    private final String name;
    final private String takeFrom;

    public ConcurrentLinkedDequeConsumer(ConcurrentLinkedDeque<String> myQueue, String name, String takeFrom) {
        this.myQueue = myQueue;
        this.name = name;
        this.takeFrom = takeFrom;
    }

    @Override
    public void run() {
            try {
                while (true){
                    String item;
                    if(takeFrom.equalsIgnoreCase("Start")){
                        item = myQueue.pollFirst();
                    } else if (takeFrom.equalsIgnoreCase("End")) {
                        item = myQueue.pollLast();
                    }
                    else {
                        item = myQueue.pollFirst();
                    }
                    if (item.equals("END")) {
                        break; // Exit if end signal is received
                    }
                    System.out.println(name + " consumed: " + item);
                    Thread.sleep(2000); // Simulate time taken to consumer
                }
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
                Thread.currentThread().interrupt();
            }
    }
}
class ConcurrentLinkedDequeProducer implements Runnable{
    final private ConcurrentLinkedDeque<String> myQueue;
    final private String name;
    final private String insertFrom;
    public ConcurrentLinkedDequeProducer(ConcurrentLinkedDeque<String> myQueue, String name, String insertFrom) {
        this.myQueue = myQueue;
        this.name = name;
        this.insertFrom = insertFrom;
    }

    @Override
    public void run() {
            try {
            for (int i = 0; i < 10; i++) {
                String item = " Item " + i;
                if (insertFrom.equalsIgnoreCase("Start")){
                    myQueue.offerFirst(item);
                } else if (insertFrom.equalsIgnoreCase("End")) {
                    myQueue.offerLast(item);
                }
                else {
                    myQueue.offerFirst(item);
                }
                myQueue.offerFirst(item);
                System.out.println(name + " produced: " + item);
                Thread.sleep(200); // Simulate time taken to produce
            }
            myQueue.add("END"); // Signal consumers to stop
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
                Thread.currentThread().interrupt();
            }
    }
}
