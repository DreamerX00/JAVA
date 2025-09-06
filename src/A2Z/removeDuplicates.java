package A2Z;

import java.util.Arrays;

public class removeDuplicates {
	public int removeDuplicate(int[] nums) {
	    if(nums.length == 0) return 0;
	    int i = 0;
	    for(int k = 1; k<nums.length;k++) {
	    	if(nums[i] != nums[k]) {
	    		i++;
	    		nums[i] = nums[k];
	    	}
	    }
	    System.out.println(Arrays.toString(Arrays.copyOf(nums, i+1)));
	    return i+1;
	}
	
	public static void main(String[] args) {
		removeDuplicates rd = new removeDuplicates();
		int[] num = {1,2,2,3,3,4,5,6,6};
		rd.removeDuplicate(num);
	}
}
