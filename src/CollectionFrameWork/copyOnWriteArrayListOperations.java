package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnWriteArrayListOperations {
	public static void main(String[] args) {
		var tempList = Arrays.asList("Java","HTML","Python","Php","C++","C#","MySQL","React");
		CopyOnWriteArrayList<String>  testList = new CopyOnWriteArrayList<>(tempList);//make copy and does operation to achieve synchronization and safety
		
		//let's take an example where ArrayList Fails
		/*var tempList = Arrays.asList("Java","HTML","Python","Php","C++","C#","MySQL","React");
		ArrayList<String> testList = new ArrayList<>(tempList);
		
		for(String itemString : testList) {
			System.out.print(itemString);
			
			if(itemString.equals("HTML")) {
				testList.add("JavaScript");
				System.out.println("Added Java Script");
			}
		}
		
		System.out.println("Updated test list = "+tempList);
		Exception Occurred = java.util.ConcurrentModificationException
		*/
		
		// Let's see what happens when we use CopyOnWriteArrayList();
		
		
		for(String itemString : testList) {
			System.out.println(itemString);
			
			if(itemString.equalsIgnoreCase("HTML")) {
				testList.add(testList.indexOf("HTML"), "JavaScript");
				testList.remove("HTML");
				System.out.println("Added Java Script");
			}
		}
		
		System.out.println("Updated test list = "+testList);
		
	}
}
