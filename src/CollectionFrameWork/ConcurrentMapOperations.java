package CollectionFrameWork;


import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapOperations {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, Integer>  mathTable = new ConcurrentHashMap<>();
		
		Thread t1 =  new Thread(() -> {
			for(int i = 0; i < 1000;i++) {
				mathTable.put(i, (i*i));
			}
		});
		Thread t2 =  new Thread(() -> {
			for(int i = 1000; i < 2000;i++) {
				mathTable.put(i, (i*i));
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		mathTable.forEach((x,y) -> System.out.println("\n"+x+" -> "+y));
	}
}
