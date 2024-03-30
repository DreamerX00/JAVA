public class Lambda_Expression {
    public static void main(String[] args) {
        // This is called Lambda Expression same as Anonymous Class, but it works only on Functional Interface
        // This helps in better code readability
        lamCheck Lc = ()->{
            for (int i = 0; i <= 8; i++) {
                for (int j = 9; j > i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        };
        Lc.reversedPyramid();
    }
}

@FunctionalInterface
interface lamCheck{
    void reversedPyramid();
}
