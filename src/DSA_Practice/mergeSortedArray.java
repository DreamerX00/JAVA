package DSA_Practice;

import java.util.Arrays;

public class mergeSortedArray {
    static void Solution(int[] nums1, int m, int[] nums2, int n){
        if(m == 0){
            System.out.println(Arrays.toString(nums2));
        }
        if (n == 0){
            System.out.println(Arrays.toString(nums1));
        }
        int totalLength = m + n -1;
        int n1Length = m-1;
        int n2Lenght = n-1;

        while(n1Length >= 0 && n2Lenght >=0){
            nums1[totalLength--] = nums1[n1Length] > nums2[n2Lenght] ? nums1[n1Length--] : nums2[n2Lenght--];
        }
        while (n2Lenght >= 0){
            nums1[totalLength--] = nums2[n2Lenght--];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        Solution(new int[] {1,2,3,0,0,0},3, new int[]{2,5,6},3);
        Solution(new int[] {0},0, new int[]{1},1);
    }
}
