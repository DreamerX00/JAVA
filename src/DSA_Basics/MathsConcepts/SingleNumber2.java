package DSA_Basics.MathsConcepts;

public class SingleNumber2 {
    static int findUnique(int[] arr){
        int ones = 0;
        int twos = 0;
        int passCount = 0;
        IO.println(String.format("""
                ========================
                 Before Going Into Loop
                ========================
                value of ones is : %s
                value of twos is : %s
                ========================
                """,
                Integer.toBinaryString(ones),
                Integer.toBinaryString(twos)
        ));

        for (int n : arr){
            int newOnes = (ones ^ n) & ~twos;
            IO.println(String.format("""
                    newOne:  %8s
                        XOR  %8s
                             -----------
                             %8s
                        AND ~%8s
                             ===========
                        Res->%8s
                             ===========
                    """,
                    Integer.toBinaryString(ones).replace(" ","0"),
                    Integer.toBinaryString(n).replace(" ","0"),
                    Integer.toBinaryString((ones^n)).replace(" ","0"),
                    Integer.toBinaryString(twos).replace(" ","0"),
                    Integer.toBinaryString(newOnes).replace(" ","0")
            ));
            int newTwos = (twos ^ n) & ~newOnes;
            IO.println(String.format("""
                    newOne:  %8s
                        XOR  %s
                             -----------
                             %8s
                        AND ~%8s
                             ===========
                        Res->%8s
                             ===========""",
                    Integer.toBinaryString(twos).replace(" ","0"),
                    Integer.toBinaryString(n).replace(" ","0"),
                    Integer.toBinaryString((twos^n)).replace(" ","0"),
                    Integer.toBinaryString(newOnes).replace(" ","0"),
                    Integer.toBinaryString(newTwos).replace(" ","0")
            ));
            ones = newOnes;
            twos = newTwos;
            passCount++;
            IO.println(String.format("""
                        
                        
                        ========================
                        Pass : %d
                        ========================
                        value of ones is : %8s
                        value of twos is : %8s
                        ========================
                        """,
                        passCount,
                        Integer.toBinaryString(ones).replace(" ","0"),
                        Integer.toBinaryString(twos).replace(" ","0")
                )
            );
        }
        return ones;
    }

    static void main() {
        IO.println("Unique Value is -> " +findUnique(new int[]{2,2,3,2,7,7,8,7,8,8}));
    }
}
