package A2Z;

public class LargestElement {
	static int findLargest(int[] arr) {
		int largest = 0;
		for(int i = 0; i < arr.length-1 ; i++) {
			if(arr[i] < arr[i+1] && arr[i+1] > largest) {
				largest = arr[i+1];
			}
		}
		
		return largest;
	}
	
	public static void main(String[] args) {
		int[] arr = {12,2,9,88,34,81,4,6,89};
		System.out.println("The Largest Element Is : "+ findLargest(arr));
	}
}
