package myjava;
import java.util.Scanner;

public class rock {
    public static void main(String[] args) {
        String equal = "It's a Draw! Try Again";
        String won = "You Won! Congrats";
        String lose = "You Lost! Try Again";
        int hands;
        String choice;
        String[] rps = {
                "Nothing",
                "Rock",
                "Paper",
                "Scissors"
        };
        System.out.println("""
                ================================================
                =   Welcome To Rock, Paper and Scissors Game   =
                =     (Obviously you are going to lose XD)     =
                ================================================
                """);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Choose One of The following:
                    1. ROCK
                    2. PAPER
                    3. SCISSORS
                    """);
            // User's Part
            System.out.print("Enter: ");
            hands = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.println("Your Call: " + rps[hands]);

            // AI's Part
            int robot = (int) (Math.random() * 3 + 1);
            System.out.println("AI's Call: " + rps[robot]);

            // Results Design
            if (hands == robot) {
                System.out.println(equal);
            } else if ((hands == 1 && robot == 3) || (hands == 2 && robot == 1) || (hands == 3 && robot == 2)) {
                System.out.println(won);
                System.out.println("Do you want to play again (Y/N): ");
                choice = sc.nextLine();
                if (choice.equalsIgnoreCase("N")) {
                    break;
                }
            } else if ((hands == 1 && robot == 2) || (hands == 2 && robot == 3) || (hands == 3 && robot == 1)) {
                System.out.println(lose);
            } else {
                System.out.println("Re-enter your choice");
            }
        }
    }
}
