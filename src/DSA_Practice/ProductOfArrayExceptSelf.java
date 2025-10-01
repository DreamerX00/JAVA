package DSA_Practice;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    //Brute force
    static int[] Solution(int[] nums){
        int[] n1 = new int[nums.length];
        Arrays.fill(n1,1);
        for(int i = 0;i < nums.length;i++){
            for (int j = 0; j < nums.length; j++){
                if(i != j){
                    n1[i] *= nums[j];
                }
            }
        }
        return n1;
    }
    //Optimize
    static int[] Solution2(int[] nums){
        int[] res = new int[nums.length];
        int[] prefixProductStart = new int[nums.length];
        int[] prefixProductEnd = new int[nums.length];
        prefixProductStart[0] = nums[0];
        for (int i = 1; i < prefixProductStart.length;i++){
            prefixProductStart[i] = prefixProductStart[i-1] * nums[i];
        }
        prefixProductEnd[nums.length-1] = nums[nums.length-1];
        for (int i = nums.length-2; i > 0; i--){
            prefixProductEnd[i] = prefixProductEnd[i+1] * nums[i];
        }
        res[0] = prefixProductEnd[1];
        res[nums.length-1] = prefixProductStart[nums.length-2];
        for (int i = 1; i < nums.length-1; i++){
            res[i] = prefixProductStart[i-1]* prefixProductEnd[i+1];
        }

        return res;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution(new int[] {1,2,3,4})));
        System.out.println(Arrays.toString(Solution2(new int[] {1,2,3,4})));
    }
}
