package DSA_Practice;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class ResortNegativePositive {
    static void Solution(int[] arr){
        SortedMap<Integer,Integer> myMap = new TreeMap<>((x,y)->{
            int absX = Math.abs(x);
            int absY = Math.abs(y);
            return absX == absY ? x - y : absX - absY;
        });
        for (int num : arr){
            int num2 = num < 0 ? -1*num : num;
            myMap.put(num,num2);
        }
        System.out.println(myMap.keySet());
    }

    public static void main(String[] args) {
        Solution(new int[]{-8,-5,-3,-1,3,6,9});
    }
}
