package MultiThreading;

public class synchronisationOperations {
    public static void main(String[] args) throws InterruptedException {
        Bank b = new Bank(1000,true);
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


class Bank extends Thread {
    private int balance = 0;
    private int counter = 0;
    boolean decesion = true;
    public Bank(int counter, boolean decesion) {
        this.counter = counter;
        this.decesion = decesion;
    }
    void getBalance(){
        System.out.println("Current balance is: " + balance);
    }
    @Override
    public void run() {
        for (int i = 0; i < counter; i++) {
            synchronized (this) {
                if (decesion) {
                    balance++;
                } else {
                    balance--;
                }
            }
            System.out.println(Thread.currentThread().getName() + " | Decision: " + decesion + " | Balance: " + balance);
        }
    }
}