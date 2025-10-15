package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileOperations {
    static void main() throws InterruptedException {

        SharedResources obj1 = new SharedResources();
        Thread writeThread = new Thread(
                () -> {
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                    obj1.setFlagTrue();
                }
        );
        Thread readThread = new Thread(
                () -> obj1.printIfFlagTrue()
        );

        writeThread.start();
        readThread.start();

        //Below is the reason why we don't use volatile
        CounterBlock2 counter = new CounterBlock2();
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

class SharedResources{
    //It is like a simple switch and made for simple tasks only
    private volatile boolean flag = false;
    public void setFlagTrue(){
        IO.println("setFlagTrue Executed !!");
        flag = true;
    }

    public void printIfFlagTrue(){
        while (!flag){}
        IO.println("Flag is True!!");
    }
}
class CounterBlock2 {
    private volatile int counter = 0;
    public void increment() {
        counter++;//IDE showing warning here because it's not helped by volatile
    }
    public int get() {
        return counter;
    }
}
