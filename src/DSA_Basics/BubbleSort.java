package DSA_Basics;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {2,39,8,88,5,1};
        boolean flag = true;
        do {
            flag = false;
            for (int i = 0; i < arr.length-1;i++){
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;
                    System.out.println("Inner Loop Algo Executed "+i);
                }
            }
        }while (flag);

        System.out.println(Arrays.toString(arr));
    }
}
