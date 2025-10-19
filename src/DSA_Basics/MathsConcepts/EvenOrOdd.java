package DSA_Basics.MathsConcepts;

public class EvenOrOdd {
    static String isOddOrEven(int value){
        int result = value & 1;
        if (result == 1) return value + " -> Number Is Odd";
        else return value + " -> Number Is Even";
    }

    static void main() {
        IO.println(isOddOrEven(12));
        IO.println(isOddOrEven(19));
    }
}
