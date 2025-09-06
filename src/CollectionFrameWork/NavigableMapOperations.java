package CollectionFrameWork;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapOperations {
	public static void main(String[] args) {
		NavigableMap<Integer, String> myNavigableMap =   new TreeMap<>();
		myNavigableMap.put(1, "China");
		myNavigableMap.put(7, "Brazil");
		myNavigableMap.put(3, "United States");
		myNavigableMap.put(10, "Mexico");
		myNavigableMap.put(4, "Indonesia");
		myNavigableMap.put(5, "Pakistan");
		myNavigableMap.put(9, "Russia");
		myNavigableMap.put(6, "Nigeria");
		myNavigableMap.put(2, "India");
		myNavigableMap.put(8, "Bangladesh");
		
		myNavigableMap.forEach((x,y)-> System.out.println("========================\nRank : "+x+"\nCountry : "+y));
		
		System.out.println("\n--- NavigableMap Exclusive Methods ---");

        // 🔽 lowerKey: Who ranks just before United States (rank 3)?
        System.out.println("lowerKey(3): " + myNavigableMap.lowerKey(3)); // Output: 2 (India)

        // 🔽 floorKey: Who ranks at or just before rank 4?
        System.out.println("floorKey(4): " + myNavigableMap.floorKey(4)); // Output: 4 (Indonesia)

        // 🔼 ceilingKey: Who ranks at or just after rank 6?
        System.out.println("ceilingKey(6): " + myNavigableMap.ceilingKey(6)); // Output: 6 (Nigeria)

        // 🔼 higherKey: Who ranks just after Brazil (rank 7)?
        System.out.println("higherKey(7): " + myNavigableMap.higherKey(7)); // Output: 8 (Bangladesh)

        // 🧹 pollFirstEntry: Remove and return the top-ranked country
        System.out.println("pollFirstEntry(): " + myNavigableMap.pollFirstEntry()); // Output: 1=China

        // 🧹 pollLastEntry: Remove and return the lowest-ranked country
        System.out.println("pollLastEntry(): " + myNavigableMap.pollLastEntry()); // Output: 10=Mexico

        // 🔁 descendingMap: View the rankings in reverse order
        System.out.println("Descending Map: " + myNavigableMap.descendingMap());

        // 🎯 subMap: Get countries ranked from 3 to 7 (inclusive)
        System.out.println("subMap(3, true, 7, true): " + myNavigableMap.subMap(3, true, 7, true));

		
		
	}
}
