package DSA_Practice;

import java.util.Arrays;

public class median_array {
	public static void main(String args[]) {
		int num1[] = {1,2,3,4,5};
		int num2[] = {6,7,8,9,10};
		findMedianSortedArrays(num1,num2);
	}
	static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] mergedArray = new int[len1+len2];
        for(int i = 0; i < nums1.length;i++){
            mergedArray[i] = nums1[i];
        }
        for (int j = 0; j < len2; j++) { 
        	mergedArray[len1 + j] = nums2[j];
        }
        Arrays.sort(mergedArray);
        if (mergedArray.length % 2 == 0) {
        	return ((double)mergedArray[mergedArray.length / 2 - 1] + mergedArray[mergedArray.length / 2]) / 2; 
        } 
        else 
        	return mergedArray[mergedArray.length / 2];
        
    }
}
