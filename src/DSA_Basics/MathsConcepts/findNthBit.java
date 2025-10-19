package DSA_Basics.MathsConcepts;

public class findNthBit {
    static int nthBit(int value , int n){
        return (value & (1 << (n-1))) > 0 ? 1 : 0;
    }

    static void main() {
        IO.print(nthBit(29,5));
        IO.print(nthBit(29,4));
        IO.print(nthBit(29,3));
        IO.print(nthBit(29,2));
        IO.print(nthBit(29,1));
    }
}
