package DSA_Basics;

import java.util.Arrays;

public class recursiveInsertion {
	public static void Sorting (int arr[]) {
		for(int i = 0; i < arr.length;i++) {
			int j = i;
			while(j > 0 && arr[j] < arr[j-1]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void recursiveSorting(int[] arr,int i , int n) {
		if(i == n) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		int j = i;
		while(j > 0 && arr[j] < arr[j-1]) {
			int temp = arr[j];
			arr[j] = arr[j-1];
			arr[j-1] = temp;
			j--;
		}
		recursiveSorting(arr,i+1,n);
		
	}
	
	public static void main(String[] args) {
		int[] arr = {12,88,9,34,2,7,99,79};
		Sorting(arr);
		int[] arr2 = {79,88,34,72,2,89,3,2,55};
		recursiveSorting(arr2,0,arr2.length);

	}
}
