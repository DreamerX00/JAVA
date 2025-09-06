package CollectionFrameWork;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapOperations {
	public static void main(String[] args) {
		ConcurrentSkipListMap<Integer, String> productMap = new ConcurrentSkipListMap<>();
		
		productMap.put(107, "Haldiram's Namkeen");
		productMap.put(102, "Tata Salt");
		productMap.put(110, "Paper Boat Drinks");
		productMap.put(103, "Parle-G Biscuits");
		productMap.put(104, "Dabur Honey");
		productMap.put(109, "Godrej Hair Dye");
		productMap.put(105, "Patanjali Aloe Vera Gel");
		productMap.put(106, "MTR Ready-to-Eat Meals");
		productMap.put(101, "Amul Butter");
		productMap.put(108, "Borosil Glassware");
		
		System.out.println("""
				========================================
				  Product ID    ||    Product Name
				========================================
				""");
		productMap.forEach((x,y) -> System.out.println("    "+x+"     ->     "+y));

		
	}
}
