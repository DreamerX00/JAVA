package DSA_Basics.MathsConcepts;

public class NumberSystemOperations {
    static void decimalToBinary(int value){

    }

    static void binaryToDecimal(StringBuilder str){
        str.reverse();
        int powValue = str.length()-1;
        int sum = 0;
        while (powValue >= 0){
            if (Integer.parseInt(""+str.charAt(powValue)) == 1){
                sum+= (int)Math.pow(2, powValue);
            }
            powValue--;
        }
        IO.println(str.toString() + " In Decimal is => "+sum);
    }


    static void main() {
        binaryToDecimal(new StringBuilder("11101"));
        binaryToDecimal(new StringBuilder("10001"));
    }
}
