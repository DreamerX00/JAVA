package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockOperations {
    private final Lock lock = new ReentrantLock();

    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("Inner Method Invoked");
            outerMethod();
        }
        finally {
            lock.unlock();
        }
    }

    public void outerMethod(){
        lock.lock();
        try{
            System.out.println("Outer XMethod Invoked");
        }
        finally {
            lock.unlock();
        }
    }
}
