import java.util.Scanner;
class menu{
    public static void main(String[] args){
        for (int i = 1; i > 0; i++) {
            System.out.print("-------- Welcome To Our Next-Level-Solutions ----------\n\n======================================\n\nEnter Your First Number :- ");
            Scanner sc = new Scanner(System.in);
            double first = sc.nextDouble();
            System.out.println("\n");
            System.out.print("Enter Your Second Number :- ");
            double second = sc.nextDouble();
            System.out.print("""
                    Choose Any One of The following Operation to perform :-\s
                    1.Addition
                    2.Subtraction
                    3.Multiplication
                    4.Division
                    5.Modulus
                    6.Exit
                    """);
            System.out.println("--> ");
            int choice = sc.nextInt();

            System.out.println("============================================");
            switch (choice) {
                case 1 -> System.out.printf("Your Answer For The Addition Is = %.2f\n", first + second);
                case 2 -> System.out.printf("Your Answer For The Subtraction Is = %.2f\n", first - second);
                case 3 -> System.out.printf("Your Answer For The Multiplication Is = %.2f\n", first * second);
                case 4 -> System.out.printf("Your Answer For The Division Is = %.2f\n", first / second);
                case 5 -> System.out.printf("Your Answer For The Modulus Is = %.2f\n", first % second);
                case 6 -> System.exit(0);
                default -> {
                }
            }
            
        }
    }
}