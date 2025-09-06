package A2Z;

public class SecondLargestElement {
	static int findSecondLargest(int[] arr) {
		int firstLargest = 0;
		int secondLargest = 0;
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] < arr[i+1] && arr[i+1] > firstLargest) {
				firstLargest = arr[i+1];
			}
		}
		int i = 0;
		int j = arr.length;
		int diff = firstLargest - secondLargest;
		while(i < j) {
			if(arr[i] < firstLargest && firstLargest - arr[i] < diff) {
				secondLargest = arr[i];
				diff = firstLargest - secondLargest;
			}
			i++;
		}
		
		return secondLargest;
	}
	static int optimalSecondLargest(int[] arr) {
		int fl = 0, sl = 0;
		for(int num : arr) {
			if(num > fl) {
				sl = fl;
				fl = num;
			}
			else if(num > sl && num < fl) {
				sl = num;
			}
		}
		
		return sl;
	}
	
	public static void main(String[] args) {
		int[] arr = {12,2,9,88,34,80,4,6,89};
		System.out.println("The Second Largest Element Is : "+ findSecondLargest(arr));
		System.out.println("The Second Largest Element Is (Optimal) : "+ findSecondLargest(arr));
	}
}
