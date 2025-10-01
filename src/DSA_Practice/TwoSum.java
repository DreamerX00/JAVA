package DSA_Practice;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    static int[] Solution(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int pos = 0;
        for(int i = 0; i < arr.length; i++){
            int next = target-arr[i];
            if(map.containsKey(next)){
                return new int[]{arr[i],next};
            }
        }
        return new int[]{0,0};
    }

    public static void main(String args[]){
        System.out.println(Arrays.toString(Solution(new int[]{2, 4,4, 6, 8, 9}, 11)));
    }
}
