import java.util.Scanner;
import java.util.Random;
public class updated_rock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RPS r = new RPS();
        r.ShowWindow();
        for (int i = 1 ; i < 100 ;i++){
           r.GetInput();
           r.AITurn();
           r.ResultTime();
        }

        sc.close();
    }
}

class RPS{
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    String equal = "It's a Draw! Try Again";
    String won = "You Won! Congrats";
    String lose = "You Lost! Try Again";
    int hands;
    int robot;
    String choice;
    String[] rps = {
            "Nothing",
            "Rock",
            "Paper",
            "Scissors"
    };
    void ShowWindow(){
        System.out.println("""
                ================================================
                =   Welcome To Rock, Paper and Scissors Game   =
                =     (Obviously you are going to lose XD)     =
                ================================================
                """);
    }
    void GetInput(){
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
    }
    void AITurn(){
        robot = random.nextInt(3)+1;
        System.out.println("AI's Call: " + rps[robot]);
    }
    void ResultTime() {
        if (hands == robot) {
            System.out.println(equal);
        } else if ((hands == 1 && robot == 3) || (hands == 2 && robot == 1) || (hands == 3 && robot == 2)) {
            System.out.println(won);
            System.out.println("Do you want to play again (Y/N): ");
            choice = sc.nextLine();
            if (choice.equals("Y") || choice.equals("y")) {
                System.out.println("\n----------------------");
            }
            else {
                System.exit(0);
                sc.close();
            }
        } else if ((hands == 1 && robot == 2) || (hands == 2 && robot == 3) || (hands == 3 && robot == 1)) {
            System.out.println(lose);
        } else {
            System.out.println("Re-enter your choice");
        }
    }
}
