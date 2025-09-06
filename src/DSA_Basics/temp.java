package DSA_Basics;

public class temp {
	public static void main(String args[]) {
		Solution sl = new Solution();
		sl.symmetry(5);
	}
}

class Solution {
    public static void symmetry(int n) {
        // Upper half of the pattern
    	for(int i = 0; i < n;i++){
            for(int j = 0;j <= i;j++){
                System.out.print("* ");
            }
            for(int j = 0; j < (n-i-1)*2;j++){
                System.out.print("  ");
            }
            for(int j = 0;j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower Half
        for(int i = n-1;i > 0;i--){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            for(int j = 0; j < (n-i)*2;j++){
                System.out.print("  ");
            }
            for(int j = 0; j< i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


