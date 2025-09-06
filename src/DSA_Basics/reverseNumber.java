package DSA_Basics;

public class reverseNumber {
	public static int reverse(int n) {
		int result = 0;
		while(n > 0) {
			result = (result * 10) +n%10;
			n /= 10;
		}
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(reverse(3444882));
	}
}
