import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;


public class QueueOperations {
	public static void main(String[] args) {
		Random rd = new Random(); 
		Queue<Integer> myList = new LinkedList<>();
		Queue<Integer> myPriorList = new PriorityQueue<>(10);
		
		System.out.println("Size Before Insertion in myList -> "+myList.size());
		System.out.println("Size Before Insertion in myPriorList -> "+myList.size());
		
		//adding elements
		for(int i = 0; i < 10;i++) {
			int random = rd.nextInt(10);
			myList.offer(random);
			myPriorList.offer(random);
		}


		
		//getting size of queue
		System.out.println("Size After Insertion in myList -> "+myList.size());
		System.out.println("Size After Insertion in myPriorList -> "+myPriorList.size());
		
		
		System.out.println("View of myList -> "+myList+"\nView of myPriorList -> "+myPriorList);
		
		//peeking elements
		System.out.println("Element On Top in myList -> "+myList.element());
		System.out.println("Element On Top in myPriorList -> "+myPriorList.element());
		
		//Last Element Removed
		System.out.println("Element From Last Is Removed in myList -> "+myList.poll());
		System.out.println("Element From Last Is Removed in myPriorList -> "+myPriorList.poll());
		
	}
}
