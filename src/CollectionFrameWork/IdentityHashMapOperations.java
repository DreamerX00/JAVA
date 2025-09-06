package CollectionFrameWork;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapOperations {
	public static void main(String[] args) {
		IdentityHashMap<String, Integer> myHashMap = new IdentityHashMap<>();
		HashMap<String, Integer> myHashMap2 =  new HashMap<>();
		
		String a1 =  new String("Akash");
		String a2 = new String("Tanisha");
		String a3 = new String("Akash");
		
		myHashMap.put(a1, 88);
		myHashMap.put(a2, 11);
		myHashMap.put(a3, 99);
		
		myHashMap2.put(a1, 88);
		myHashMap2.put(a2, 11);
		myHashMap2.put(a3, 99);
		
		System.out.println("\nResult Of Identity Hashmap\n");
		
		myHashMap.forEach((x,y) -> {
			System.out.println("Key = " + x + "\nValue = "+y);
		});
		
		
		System.out.println("\nResult Of Normal Hashmap\n");
		myHashMap2.forEach((x,y) -> {
			System.out.println("Key = " + x + "\nValue = "+y);
		});
	}
}
