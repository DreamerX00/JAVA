package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicOperations {
    static void main() throws InterruptedException {
        CounterBlock counter = new CounterBlock();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t1.join();
        IO.println(counter.get());
    }


}

class CounterBlock {
    private AtomicInteger counter = new AtomicInteger(0);
    public void increment() {
        counter.incrementAndGet();
    }
    public int get() {
        return counter.get();
    }
}
