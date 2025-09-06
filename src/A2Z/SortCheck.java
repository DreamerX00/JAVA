package A2Z;

public class SortCheck {
	public static boolean sortCheck(int[] arr) {
		boolean status = false;
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] < arr[i+1]) status = true;
			else {
				status = false;
				break;
			}
		}
		
		return status;
	}
	
	public static void main(String[] args) {
		int[] arr = {9,4,23,1,34};
		System.out.println(sortCheck(arr) ? "Array Is Sorted !!" : "Arrays Is Not Sorted");
	}
}
