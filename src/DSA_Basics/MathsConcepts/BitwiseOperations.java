package DSA_Basics.MathsConcepts;

public class BitwiseOperations {
    //Set ith bit to 1 if not
    static int setBit(int value,int n){
        value = value | (1 << (n-1));
        return (value & (1 << (n-1))) > 0 ? 1 : 0;
    }

    // make nth Bit 0
    static int setZero(int value, int n){
        value = value | (1 << (n-1));
        return (value & ~(1 << (n-1))) > 0 ? 1 : 0;
    }

    //find the position of the right most set bit
    static int findPosition(int value){
        int res = 0;
        for (int i = 0; i < value; i++){
            if((value & (1 << i)) != 0){
                res = i;
                break;
            }
        }
        return res;
    }

    static void main() {
        //29 int Binary is 11101
        IO.print(setBit(29,5));
        IO.print(setBit(29,4));
        IO.print(setBit(29,3));
        IO.print(setBit(29,2));
        IO.print(setBit(29,1));

        IO.println(setZero(29,2));

        String findPos = "Found This On 2^";
        IO.println(findPos+findPosition(29));
        IO.println(findPos+findPosition(8));
        //Alternate of this is
        IO.println(findPos+Integer.numberOfTrailingZeros(8));
        IO.println(findPos+Integer.numberOfTrailingZeros(16));

    }
}
