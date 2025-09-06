package DSA_Basics;

import java.util.Arrays;

public class quickSort {
	static void QuickSorting(int arr[], int low , int high) {
		if(low >= high) return;
		int pivot = findPivot(arr,low,high);
		QuickSorting(arr, low, pivot-1);
		QuickSorting(arr,pivot + 1,high);
	}
	
	static int findPivot(int[] arr, int low,int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		while(i < j) {
			while (arr[i] <= pivot && i <= high-1) i++;
			while (arr[j] > pivot && j >= low+1) j--;
			
			if(i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
		arr[low] = arr[j];
		arr[j] = pivot;
		
		
		return j;
	}
	
	public static void main(String[] args) {
		int[] arr = {12,8,7,11,3,15,28,25,88,21};
		QuickSorting(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
