package DSA_Basics.MathsConcepts;

public class SingleNumber {
    static int findUnique(int[] num){
        int result = 0;
        for (int value : num){
            IO.println("Currently On : "+value);
            IO.print(result +" XOR " +value);
            result ^= value;
            IO.println(" : Result is => "+result);
        }
        return result;
    }

    static void main() {
        IO.println(findUnique(new int[]{2,3,4,1,2,1,3,6,4}));

    }
}
