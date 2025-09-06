package DSA_Basics;

import java.util.Arrays;

public class recursiveBubble {
	public static void sorting(int[] arr) {
		boolean flag;
		do {
			flag = false;
			for(int i = 0; i < arr.length-1;i++) {
					if(arr[i] > arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					flag = true;
					System.out.println(Arrays.toString(arr));
				}
			}
			
		}
		while(flag);
	}
	
	public static void recurseSort(int[] arr, int size) {
		if(size == 1) {
			return;
		}
		
		for(int i = 0; i < size-1;i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			System.out.println(Arrays.toString(arr));
			
		}
		recurseSort(arr,size-1);
	}
	
	public static void main(String[] args) {
		int arr[] = {12,88,8,2,10,3,1};
		sorting(arr);
		System.out.println("------ In Recursion Sorting Of Bubble --------");
		int arr2[] = {12,88,8,2,10,3,1};
		recurseSort(arr2,arr2.length);
	}
}
