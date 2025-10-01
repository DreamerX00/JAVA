package DSA_Basics;

import java.util.Arrays;

public class SortZeroOne {
    static void Solution(int[] nums){
        int count = 0;
        for(int n : nums){
            if (n == 1){
                count++;
            }
        }
        for (int i = 0; i < nums.length - count;i++){
            nums[i] = 0;
        }
        for (int i = count-1; i < nums.length; i++){
            nums[i] = 1;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Solution(new int[]{1,0,1,0,1,0,1});
    }
}
