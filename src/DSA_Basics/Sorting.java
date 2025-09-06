package DSA_Basics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import practicals.p4_this;


public class Sorting {
	static Scanner sc = new Scanner(System.in);
	private static int size;
	private static int[] arr = new int[size];


	//To Get Inputs By User For Array Size and Elements
	static void getArray() {
		System.out.print("Enter The Size Of Array : ");
		size = sc.nextInt();
		for(int i = 0;i< arr.length;i++) {
			System.out.print("Enter Your Element On Index value "+i+" -> ");
			arr[i] = sc.nextInt(); 
		}
	}

	//To Print Array Sorted By The Functions
	static void printArray() {
		String printString = Arrays.toString(arr);
		System.out.println(printString);
	}

	//Logic For Insertion Sort
	static void insertionSort() {
		int prev;
		for(int i = 1;i < size; i++) {
			prev = i;
			while(prev > 0 && arr[prev] < arr[prev-1]) {
				int temp = arr[prev];
				arr[prev] = arr[prev-1];
				arr[prev-1] = temp;
				prev--;
			}
		}
	}
	
	//Logic For Bubble Sort With Optimized Version Of A Swap counter
	static void bubbleSort() {
		int temp;
		boolean status = true;
		for(int i = 0; i < size; i++) {
			for(int k = 0; k < size; k++) {
				if (arr[k] > arr[k+1] ) {
					temp = arr[k+1];
					arr[k+1] = arr[k];
					arr[k] = temp;
					status = true;
				}
			}
			if (!status) { 
				System.out.println("Array Already Sorted");
				printArray();
				return;
			}
		}
		
		System.out.println("Result  After Bubble Sort");
		printArray();
		
	}
	
	//Logic For Selection Sort
	static void selectionSort() {
		for(int i = 0; i < size; i++) {
			int minIndex = i;
			for(int j = i+1; j < size;j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp; 
			}
		}
		System.out.println("Result After Selection Sort");
		printArray();
	}
	
	//Logic For Merge Sort
	
	static void divide(int arr[], int startIndex,int endIndex) {
		if(startIndex >= endIndex) {
			return;
		}
		
		int mid = startIndex+(endIndex-startIndex)/2;
		
		divide(arr, startIndex, mid);
		divide(arr, mid+1, endIndex);
		reMerge(arr, startIndex, endIndex, mid);
	}
	
	static void reMerge(int arr[],int startIndex,int endIndex,int mid) {
		int merged[] = new int[endIndex-startIndex+1];
		
		int index1 = startIndex;
		int index2 = mid+1;
		int x = 0;
		
		while(index1 <= mid && index2 <= endIndex) {
			if (arr[index1] <= arr[index2]) {
				merged[x++]= arr[index1++];merged[x++]= arr[index1++];
			}
			else {
				merged[x++] = arr[index2++];
			}
		}
		
		while(index1 <= mid) {
			merged[x++]= arr[index1++];
		}
		
		while(index2 <= endIndex) {
			merged[x++] = arr[index2++];
		}
		
		for(int i = 0,j=startIndex;i<merged.length;i++,j++) {
			arr[j] = merged[i]; 
		}
		
	}
	
	static void mergeSort() {
		divide(arr, 0, size-1);
		System.out.println("Result After Merge Sort");
		printArray();
		
	}
}