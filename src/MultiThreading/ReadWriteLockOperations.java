package MultiThreading;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockOperations {
    private int count = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public void increment(){
        lock.writeLock().lock();
        try {
            this.count+=1;
            Thread.sleep(50);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            lock.writeLock().unlock();
        }
    }
    public void getCount(){
        lock.readLock().lock();
        try{
            System.out.println(Thread.currentThread().getName()+" Current Count : "+this.count);
            Thread.sleep(50);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            lock.readLock().unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        ReadWriteLockOperations readWriteLockOperations = new ReadWriteLockOperations();
        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10;i++) readWriteLockOperations.getCount();
            }
        };

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10;i++) readWriteLockOperations.increment();
            }
        };
        Thread r1 = new Thread(readTask,"Read Task 1");
        Thread r2 = new Thread(readTask,"Read Task 2");
        Thread r3 = new Thread(readTask,"Read Task 3");
        Thread w1 = new Thread(writeTask,"Write Task 1");
        Thread w2 = new Thread(writeTask,"Write Task 2");
        Thread w3 = new Thread(writeTask,"Write Task 3");

        w1.start();
        r1.start();
        Thread.sleep(2000);
        w2.start();
        r2.start();
        w3.start();
        r3.start();
    }


}
