package A2Z;

import java.util.ArrayList;
import java.util.List;

public class rotateArray {
	public void rotate(int[] nums, int k) {
        List<Integer> myList = new ArrayList<>();
        k  = k % nums.length;
        int start = nums.length - k;
        int end = nums.length-1;
        
        for(int i = start; i <= end;i++) {
        	myList.add(nums[i]);
        }
        for(int i = 0; i < start;i++) {
        	myList.add(nums[i]);
        }
        
        for(int i = 0; i < nums.length;i++) {
        	nums[i] = myList.get(i);
        }
        
    }
	
	public void rotateOptimised(int[] nums, int k) {
		k = k%nums.length;
		int size = nums.length;
		
		reverseArray(nums,0,size-1);
		reverseArray(nums,0,k-1);
		reverseArray(nums,k,size-1);
		
		
	}
	
	public void reverseArray(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			end--;
			start++;
		}
	}
}
