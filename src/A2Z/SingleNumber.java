package A2Z;

import java.util.Arrays;

public class SingleNumber {
    static int singleNumber(int[] arr)
    {
        int result = 0;
        for (int n : arr){
            result ^= n;
        }
        return result;
    }
    static void main() {
        IO.println(singleNumber(new int[]{4,1,2,1,2}));
        IO.println(singleNumber(new int[]{2,2,1}));
        IO.println(singleNumber(new int[]{1,0,1}));
    }
}
