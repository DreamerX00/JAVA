package DSA_Practice;

import java.util.*;

public class majorityElement {
	public static List<Integer> findMajority(int[] nums) {
	    List<Integer> major = new ArrayList<>();
	    int n = nums.length;
	    int limit = n / 3;
	    
	    // Use a HashMap instead of an array for handling negative numbers
	    Map<Integer, Integer> hashMap = new HashMap<>();

	    for (int item : nums) {
	        hashMap.put(item, hashMap.getOrDefault(item, 0) + 1);
	    }

	    for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
	        if (entry.getValue() > limit) {
	            major.add(entry.getKey());
	        }
	    }

	    Collections.sort(major);
	    return major;
	}
	
	
	
	
	public static void main(String[] args) {
		int arr[] = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
		System.out.println(findMajority(arr));
	}
}
