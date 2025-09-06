package MultiThreading;

public class ThreadLifeCycle {
	public static void main(String[] args) throws InterruptedException {
		int appleCount = 10;
		int appleWeight = 8;
		
		CalculateLoad cLoad = new CalculateLoad(appleCount, appleWeight);
		//Thread State Before .start()
		System.out.println(cLoad.getState());
		
		//Thread State On .start()
		cLoad.start();
		System.out.println(cLoad.getState());
		
		//Thread State After .sleep();
		Thread.sleep(1000);
		System.out.println(cLoad.getState());
		
		//Thread State After .join();
		
	}
}

class CalculateLoad extends Thread{
	
	private int count = 0;
	private int weight = 0;
	
	public CalculateLoad(int count, int weight) {
		this.count = count;
		this.weight = weight;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("The Toal Load of "+count+" Items Of Weight "+weight+" Is = "+(count*weight));
	}
}
