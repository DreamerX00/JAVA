package MultiThreading;

public class ThreadCommunication {
    private int data;
    private boolean hasData;

    public synchronized int consume(){
        while(!hasData){
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consumed "+data);
        notify();

        return data;
    }
    public synchronized void produce(int i){
        while (hasData){
            try{
                wait();
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        data = i;
        hasData = true;
        System.out.println("Produced "+i);
        notify();
    }

    public static void main(String[] args) {
        ThreadCommunication resource = new ThreadCommunication();
        Thread t1 = new Thread(new Producer(resource));
        Thread t2 = new Thread(new Consumer(resource));
        t1.start();
        t2.start();

    }
}
class Producer implements Runnable{
    private ThreadCommunication resource;

    public Producer(ThreadCommunication resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            resource.produce(i);
        }
    }
}
class Consumer implements Runnable{
    private ThreadCommunication resource;

    public Consumer(ThreadCommunication resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            resource.consume();
        }
    }
}
