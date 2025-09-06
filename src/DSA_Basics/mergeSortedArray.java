package DSA_Basics;

import java.util.Arrays;

public class mergeSortedArray {
	//Arrays.sort() approach;
	
	static void firstApproach(int[] nums1, int m, int[] nums2, int n) {
		System.out.println("========================================");
		System.out.println("Current Nums1 = "+Arrays.toString(nums1));
		System.out.println("Current Nums2 = "+Arrays.toString(nums2));
		System.out.println("========================================");
		for(int i = 0; i < nums2.length; i++) {
			nums1[m+i] = nums2[i]; 
			System.out.println("Updated Nums1 = "+Arrays.toString(nums1));
		}
		Arrays.sort(nums1);
		System.out.println("========================================");
		System.out.println("Final Sorted Array = "+Arrays.toString(nums1));
		System.out.println("========================================\n");
	}
	
	static void secondApproach(int[] nums1, int m, int[] nums2, int n) {
		System.out.println("========================================");
		System.out.println("Current Nums1 = "+Arrays.toString(nums1));
		System.out.println("Current Nums2 = "+Arrays.toString(nums2));
		System.out.println("========================================");
		
		int size = (m+n)-1;
		int index1 = m-1;
		int index2 = n-1;
		
		while(index2 >= 0) {
			System.out.println("index1 : "+ index1);
			System.out.println("index2 : "+ index2);
			System.out.println("checking Condition "+nums1[index1]+" > "+nums2[index2]);
			if(index1 >= 0 && nums1[index1] > nums2[index2]) {
				nums1[size--] = nums1[index1--];
				System.out.println("[if block]   -- Updated Nums1 = "+Arrays.toString(nums1));
				
			}
			else {
				nums1[size--] = nums2[index2--];
				System.out.println("[else block] -- Updated Nums1 = "+Arrays.toString(nums1));
			}
		}
		System.out.println("========================================");
		System.out.println("Final Sorted Array = "+Arrays.toString(nums1));
		System.out.println("========================================\n");
	}
	
	
	public static void main(String[] args) {
		firstApproach(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
		secondApproach(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
	}
}
