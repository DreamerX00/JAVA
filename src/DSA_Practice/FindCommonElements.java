package DSA_Practice;

import java.util.Arrays;

public class FindCommonElements {
    static void Solution(int[] arr1, int[] arr2, int[] arr3){
        int i = 0, j = 0, k = 0;
        int count = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length){
            int max = greatest(arr1[i],arr2[j],arr3[k]);

            if (arr1[i] != max){
                i++;
            }
            if (arr2[j] != max){
                j++;
            }
            if (arr3[k] != max){
                k++;
            }
            if (i < arr1.length && j < arr2.length && k < arr3.length &&
                arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                arr1[count] = max;
                count++;
                i++;
                j++;
                k++;
            }

        }
        for (int x = count; x < arr1.length; x++){
            arr1[x] = -1;
        }


        System.out.println(Arrays.toString(Arrays.copyOf(arr1,count)));
    }

    static int greatest(int a, int b, int c){
        if(a >= b && a >= c){
            return a;
        }
        else if(b >= c && b >= a){
            return b;
        }else{
            return c;
        }
    }

    public static void main(String[] args) {
        Solution(new int[]{1,2,5,7,8,11,19,21,22,28}, new int[]{2,3,6,7,15,19,21,28,29,30}, new int[]{2,7,8,15,19,21,22,23,28,30});
        Solution2Refined(new int[]{1,2,5,7,8,11,19,21,22,28}, new int[]{2,3,6,7,15,19,21,28,29,30}, new int[]{2,7,8,15,19,21,22,23,28,30});
    }

     static void Solution2Refined(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        int count = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            // If all three are equal, it's a common element
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                arr1[count++] = arr1[i];
                i++; j++; k++;
            }
            // Move the pointer(s) with the smallest value
            else {
                int min = Math.min(arr1[i], Math.min(arr2[j], arr3[k]));
                if (arr1[i] == min) i++;
                if (arr2[j] == min) j++;
                if (arr3[k] == min) k++;
            }
        }
        // Optional: Fill remaining with -1 or just print the result
        System.out.println(Arrays.toString(Arrays.copyOf(arr1, count)));
    }
}


