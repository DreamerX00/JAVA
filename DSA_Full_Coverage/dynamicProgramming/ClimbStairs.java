package DSA_Full_Coverage.dynamicProgramming;

public class ClimbStairs {
    static int climb(int n){
        if(n == 0) return 1;
        if(n == 1) return 0;
        return climb(n-1) + climb(n-2);
    }
    public static void main (String[] args) {
        System.out.println(climb(4));
    }
}
