package MultiThreading;


public class gettingStarted {
	public static void main(String[] args) {
		System.out.println("Hi I Called A Thread.");
		System.out.println(Thread.currentThread().getName());
		Thread t1 = new Thread(new Shop2());
		t1.start();
        System.out.println("Thread t1 -> "+t1.getState());
		Shop sp = new Shop();
        sp.start();
        System.out.println("new Shop -> "+sp.getState());
		for(int i = 0; i < 10;i++) {
			System.out.println("Executing This Line From Main -> "+i);
		}
		System.out.println("Thread t1 -> "+t1.getState());
		System.out.println("new Shop -> "+sp.getState());
	}
}

class Shop extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 10;i++) {
			System.out.println("Executing This Line From Shop -> "+i);
		}
	}
}

class Shop2 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 10;i++) {
			System.out.println("Executing This Line From Shop2 -> "+i);
		}
	}
}
