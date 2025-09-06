package DSA_Basics;

public class Recursion {
	//basic recursion code
	int count = 1;
	
	void first() {
		if(count == 4) {
			return;
		}
		else System.out.println("Function Called "+(count++));
		first();
	}
	
	
	
	
	public static void main(String[] args) {
		Recursion rc = new Recursion();
		rc.first();
	}
}
