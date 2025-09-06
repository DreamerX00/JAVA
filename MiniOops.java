import java.util.Random;
import java.util.Scanner;

public class MiniOops {
    public static void main(String[] args) {
        Level level = new Level();
        level.welcome();

        while (true) {
            level.menu();
            level.choiceInput();

            if (level.option == 0) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            level.info();
            level.generator();
            level.play();
        }
    }
}

class Game {
    protected Scanner sc = new Scanner(System.in);
    protected Random random = new Random();
    protected int guess;
    protected int stage;
    protected int generatedNumber;

    protected void welcome() {
        System.out.println("""
                ================================================
                |                WELCOME GAMERS                |
                |           IT'S TIME TO TEST YOUR MIND        |
                |           ARE YOU BETTER THAN COMPUTER       |
                |LET'S START WITH A SIMPLE NUMBER GUESSING GAME|
                ================================================
                """);
    }

    protected void generator() {
        int[] level = {0, 10, 50, 100, 500, 1000, 10000, 100000, 1000000, 100000000};
        stage = level[getOption()];
        generatedNumber = random.nextInt(stage + 1);
        System.out.println("A Random Number is generated between 0 and " + stage);
    }

    protected int getOption() {
        return 0; // Default implementation, to be overridden by child classes
    }

    protected void play() {
        if (getOption() == 0) {
            return;
        }

        int z = 0;

        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            z++;

            if (guess == generatedNumber) {
                System.out.printf("Congrats! You Guessed The Number Bro (Attempt Count: %d)\n", z);

                if (z == 1) {
                    System.out.println("You Are Too Good for This level");
                } else if (z <= 5) {
                    System.out.println("You Are Good for This level");
                } else if (z <= 10) {
                    System.out.println("You Are Average on This level");
                } else if (z <= 50) {
                    System.out.println("Bro Stop! You Are Noob. Just Try An Easier level");
                } else if (z <= 100) {
                    System.out.println("You should stop using your brain cause you don't have one");
                } else {
                    System.exit(0);
                }

                break;
            } else if (guess > generatedNumber && guess >= 0 && guess <= stage) {
                System.out.printf("Bro You Typed A Greater Number (Attempt Count: %d)\n", z);
            } else if (guess < generatedNumber && guess >= 0 && guess <= stage) {
                System.out.printf("Bro You Typed A Lesser Number (Attempt Count: %d)\n", z);
            } else if (guess < 0) {
                System.out.printf("Lol Noob It Was: %d \nAnd you Literally Can't Even Find That After %d Attempts\n", generatedNumber, z);
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer within the valid range.");
            }
        }
    }
}

class Level extends Game {
    protected int option;

    protected void menu() {
        System.out.println("""
                Choose Your Level: (Enter 0 to exit)
                1. Easy
                2. Medium
                3. Hard
                4. Insane
                5. Extreme
                6. Impossible
                7. God of Prediction
                8. Bro Knows Who Asked
                9. Supernova of Brain
                """);
    }

    protected void choiceInput() {
        System.out.print("--> ");
        option = sc.nextInt();
    }

    protected void info() {
        String[] levelNames = {"", "Easy", "Medium", "Hard", "Insane", "Extreme", "Impossible", "God of Prediction", "Bro Knows Who Asked", "Supernova of Brain"};

        if (option >= 1 && option <= 9) {
            System.out.println("Level Mode == " + levelNames[option]);
        } else if (option == 0) {
            System.out.println("Exiting the program. Goodbye!");
        } else {
            System.out.println("Invalid option. Please try again.");
        }
    }

    protected int getOption() {
        return option;
    }
}
