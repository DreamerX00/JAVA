package DSA_Basics;

import java.util.Arrays;
import java.util.Scanner;

public class searching {
	//Linear Searching Algorithm
	static void linear(int[] arr, int n) {
		for(int i = 0; i< arr.length;i++) {
			if (arr[i] == n) {
				System.out.println("\nThe Result Of Linear Search\n\tThe Element Was Found On index "+i);
				break;
			}
		}		
	}
	
	//Binary Searching Algorithm
	
	static void binary(int arr[], int n ) {
		int start = 0;
		int end = arr.length -1;
		int mid = (start+end)/2;
		Arrays.sort(arr);
		String a = Arrays.toString(arr);
		
		for(int i = 0; i < arr.length;i++) {
			mid = (start+end)/2;
			
			if(arr[mid] == n) {

				System.out.println("\n\nThe Result Of Binary Search\n\tElement Was Found On Index "+mid+ " Of Sorted Array "+a);
				return;
			}
			else if (arr[mid] > n) {
				end = mid -1;
			}
			else{
				start = mid + 1;
			}
			
		}
		System.out.println("Element Not found");
	}
	
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter The Size Of The Array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0;i< arr.length;i++) {
			arr[i] = sc.nextInt(); 
		}
		
		System.out.print("Enter The Element You Want To Search : ");
		int search = sc.nextInt();
		linear(arr, search);
		binary(arr, search);
		
		sc.close();
		
		
	}
}


