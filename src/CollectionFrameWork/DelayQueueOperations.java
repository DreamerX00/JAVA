package CollectionFrameWork;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

public class DelayQueueOperations {
    public static void main(String[] args) throws InterruptedException {
        // Implementation will be similar to BlockingQueueOperations but using DelayQueue
        BlockingQueue<MyTodoList> myQueue = new DelayQueue<>();
        myQueue.put(new MyTodoList("Wake Up", 8000));
        myQueue.put(new MyTodoList("Brush", 4000));
        myQueue.put(new MyTodoList("Breakfast", 6000));
        myQueue.put(new MyTodoList("Go to Office", 10000));
        System.out.println("Starting at " + java.time.LocalTime.now());
        while (!myQueue.isEmpty()) {
            System.out.println("Task: " + myQueue.take() + " at " + java.time.LocalTime.now());
        }

    }
}

class MyTodoList implements Delayed {
    private String task;
    private long startTime;

    public MyTodoList(String task, long delayInMilliseconds) {
        this.task = task;
        this.startTime = System.currentTimeMillis() + delayInMilliseconds;
    }

    @Override
    public long getDelay(java.util.concurrent.TimeUnit unit) {
        long diff = startTime - System.currentTimeMillis();
        return unit.convert(diff, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.startTime < ((MyTodoList) o).startTime) {
            return -1;
        }
        if (this.startTime > ((MyTodoList) o).startTime) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return this.task;
    }
}
