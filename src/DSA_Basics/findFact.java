package DSA_Basics;

public class findFact {
    int factorial(int n){
        if(n==0)return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        findFact ff = new findFact();
        int result = ff.factorial(5);
        System.out.println(result);
    }
}
