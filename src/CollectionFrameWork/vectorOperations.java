package CollectionFrameWork;

import java.util.Vector;

public class vectorOperations {
	public static void main(String[] args) {
		
		//we can set initial capacity and increment
		Vector<Integer> myVector = new Vector<>(5/*initial Capacity */,3/*capacityIncrement*/);
		myVector.add(88);
		myVector.add(89);
		myVector.add(8);
		myVector.add(19);
		myVector.add(10);
		
		
		System.out.println(myVector);
		
		
		//check capacity //doubles the capacity on each exceed
		System.out.println(myVector.capacity());
		
		
		/* Vector is thread safe and synchronized
		 * ArrayList May Fail In Multi-Threaded Environment
		 * Maintains The Concurrency of process 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}
}
