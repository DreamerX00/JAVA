package MultiThreading;

import java.util.concurrent.locks.*;

public class unfairLockOperations {
    private final Lock unfairLock = new ReentrantLock();
    private static final Lock fairLock = new ReentrantLock(true);
    public void startWriting(){
        unfairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " Acquired The Lock In Writing");
            Thread.sleep(500);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName()+" Released The Lock In Writing");
            unfairLock.unlock();
        }
    }
    static void startPrinting(){
        fairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" Acquired The Lock In Printing");
            Thread.sleep(500);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName()+" Released The Lock In Printing");
            fairLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        unfairLockOperations ulo = new unfairLockOperations();
        Runnable rn = new Runnable() {
            @Override
            public void run() {
                ulo.startWriting();
            }
        };
        Runnable rn2 = new Runnable() {
            @Override
            public void run() {
                startPrinting();
            }
        };

        Thread t1 = new Thread(rn,"Thread 1");
        Thread t2 = new Thread(rn,"Thread 2");
        Thread t3 = new Thread(rn,"Thread 3");
        Thread p1 = new Thread(rn2,"Printing Thread 1");
        Thread p2 = new Thread(rn2,"Printing Thread 2");
        Thread p3 = new Thread(rn2,"Printing Thread 3");

        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(2000);
        p1.start();
        p2.start();
        p3.start();
    }
}
