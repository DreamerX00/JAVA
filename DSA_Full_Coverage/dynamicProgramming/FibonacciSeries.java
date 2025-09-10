package DSA_Full_Coverage.dynamicProgramming;

import java.util.Arrays;

public class FibonacciSeries {
    static int fib(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != -1) return memo[n];
        return memo[n] = (fib(n - 1,memo) + fib(n - 2,memo));
    }

    static int fib2(int n){
        int prev1 = 1;
        int prev2 = 0;
        for(int i = 2; i <= n;i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] memo = new int [n+1];
        Arrays.fill(memo, -1);
        fib(n, memo);
        fib2(n);
        System.out.println("Fibonacci number at position " + n + " is: " + fib(n, memo));
        System.out.println("Memoization array: " + Arrays.toString(memo));
        System.out.println("Fibonacci number at position " + n + " using tabulation is: " + fib2(n));
    }
}
