package DSA_Practice;

public class Q1752 {
	public static boolean check(int[] arr) {
		boolean status = true;
		int startIndex = 0;
		int smallest = Integer.MAX_VALUE;
		for(int i = 0; i< arr.length-1;i++) {
			if(arr[i] < arr[i+1] && arr[i] < smallest) {
				startIndex = i;
			}
		}
		System.out.println(startIndex);
		
		int i = startIndex;
		int j = i+1;
		while(startIndex != j) {
			if(arr[i] < arr[j]) {
				status = true;
				i++;
			}
			else {
				status = false;
				break;
			}
			if(j == arr.length) {
				j = 1;
				i = 0;
			}
			
		}
		
		
		return status;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,4,5,1,2};
		System.out.println(check(arr));
	}
}
