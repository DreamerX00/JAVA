package DSA_Basics;

public class fibonacciSeries {
    static int fib(int n){
        if(n <= 1) return n;
        System.out.print(n - 1 + " " + (n - 2) +" ");
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = fib(n);
        System.out.println("\nFibonacci number at position " + n + " is: " + result);
    }
}
