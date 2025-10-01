package MultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class lockOperations {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("This is lock operation in multithreading");
        Bank2 b = new Bank2(1000,true);
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        b.getBalance();

    }
}
class Bank2 extends Thread {
    private int balance = 0;
    private int counter = 0;
    boolean decision = true;
    private final Lock lock = new ReentrantLock();
    boolean acquired = false;
    public Bank2(int counter, boolean decision) {
        this.counter = counter;
        this.decision = decision;
    }
    void getBalance(){
        System.out.println("Current balance is: " + balance);
    }
    @Override
    public void run() {
        try {
            acquired = lock.tryLock(8000, TimeUnit.MILLISECONDS);
            if (acquired) {
               for (int j = 0; j < counter; j++) {
                    if (decision) {
                        balance++;
                    } else {
                        balance--;
                    }
                    System.out.print("\r"+Thread.currentThread().getName() + " | Decision: " + decision + " | Balance: " + balance);
                }
            }
            else {
                System.out.print("\r"+Thread.currentThread().getName() + " could not acquire the lock and is skipping the operation.");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }finally {
            if (acquired) lock.unlock();
        }
    }
}
