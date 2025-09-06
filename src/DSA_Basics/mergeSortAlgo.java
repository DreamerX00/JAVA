package DSA_Basics;

import java.util.Arrays;

public class mergeSortAlgo {
	public static void mergeSort(int arr[],int left, int right) {
		//finding mid
		int mid = left+(right-left)/2;
		
		//setting base case
		if(left >= right) return;
		mergeSort(arr,left,mid);
		mergeSort(arr,mid+1,right);
		
		merge(arr,left,right,mid);
	}
	
	public static void merge(int arr[],int left, int right, int mid) {
		//get size for temporary array;
		int sizeLeft = mid - left +1;
		int sizeRight = right -mid;
		
		//creating the temporary array
		int leftArr[] = new int[sizeLeft];
		int rightArr[] = new int[sizeRight];
		
		//copying data into these Array;
		System.arraycopy(arr, left, leftArr, 0, sizeLeft);
		System.arraycopy(arr, mid+1, rightArr, 0, sizeRight);
		
		// i defines the position of left array
		// j defines the position of right array
		// k defines the position of result array
		int i = 0,j = 0,k= left;
		
		
		//sorting the array and adding it to result array
		while(i < sizeLeft && j < sizeRight) {
			if(leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			}
			else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		//after sorting remaining elements of either array will be added in the loop
		while(i < sizeLeft) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		
		while(j < sizeRight) {
			arr[k] = rightArr[j];
			k++;
			j++;
		}
		
	}
	
	//Another Way To Implement The Same Is
	public static void mergeSort2(int arr[]) {
		if(arr.length > 1) {
			int mid = arr.length/2;
			int left[] = Arrays.copyOfRange(arr, 0, mid);
			int right[] = Arrays.copyOfRange(arr, mid, arr.length);
		
			mergeSort2(left);
			mergeSort2(right);
		
			merge2(arr,left,right);
		}
		
	}
	
	public static void merge2(int arr[], int left[], int right[]) {
		int i = 0,j=0,k=0;
		
		while(i < left.length && j < right.length) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
				k++;
			}
			else {
				arr[k] = right[j];
				j++;
				k++;
			}
		}
		
		while(i < left.length) {
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while(j < right.length) {
			arr[k] = right[j];
			j++;
			k++;
		}
		
	}
	
	
	public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        int[] arr2 = {83,22,18,99,3,22,15,7};
        System.out.println("Original Array : "+ Arrays.toString(arr2));
        mergeSort2(arr2);
        System.out.println("Sorted Array : "+ Arrays.toString(arr2));
    }

}
