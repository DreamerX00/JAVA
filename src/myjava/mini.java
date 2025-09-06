package myjava;

import java.util.Scanner;
public class mini {
    public static void main(String[] args){
        int range;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Level of Difficulty range (1-10) ");
        System.out.print("--> ");

        range = sc.nextInt();

        int[] Level = {0,10,50,100,250,500,750,1000,20000,50000,100000};
        int level = Level[range];

        switch (range) {
            case 1 -> System.out.println("Level Mode == Too Easy");
            case 2 -> System.out.println("Level Mode == Easy");
            case 3 -> System.out.println("Level Mode == Medium");
            case 4 -> System.out.println("Level Mode == Hard");
            case 5 -> System.out.println("Level Mode == Too Hard");
            case 6 -> System.out.println("Level Mode == Extreme");
            case 7 -> System.out.println("Level Mode == Insane");
            case 8 -> System.out.println("Level Mode == Impossible");
            case 9 -> System.out.println("Level Mode == Explosive");
            case 10 -> System.out.println("Level Mode == God Of The Maths");
            default -> System.out.println("Na bro try again ");
        }

        int a = (int)(Math.random()*level+1);
        System.out.printf("\n\nA Random Number Between 1 to %d is generated Can you Guess The number and if you cant just type a number less than 0\n\nEnter Your Guess :-",level);
        int z = 0;
        for (int i = 1; i < 200; i++) {
            int guess = sc.nextInt();
            z++;
            
            if (a == guess) {
                System.out.printf("Congrats You Guessed The Number Bro     (Attempt Count : %d)\n",z);
                if (z == 1) {
                    System.out.println("You Are Too Good for This level");
                    System.exit(0);
                }
                else if(z == 5 || z < 5){
                    System.out.println("You Are Good for This level");
                    System.exit(0);
                }
                else if(z == 10 || z < 10){
                    System.out.println("You Are Average on This level");
                    System.exit(0);
                }
                else if(z == 50 || z < 50){
                    System.out.println("Bro Stop You Are Noob Just Try An Easier level");
                    System.exit(0);
                }
                else if(z == 100 || z < 100){
                    System.out.println("You should stop using your brain cause you don't have one");
                    System.exit(0);
                }
                else {
                    System.exit(0);
                }
                
                
            }
            else if(guess > a && guess >= 0 && guess <= level){
                System.out.printf("Bro You Typed A Greater Number          (Attempt Count : %d)\n",z);
            }
            else if(guess < a && guess >= 0 && guess <= level){
                System.out.printf("Bro You Typed A Lesser Number           (Attempt Count : %d)\n",z);
            }
            else if(guess < 0){
                System.out.printf("Lol Noob It Was :- %d \nAnd you Literally Can't Even Find That After %d Attempts\n",a,z);
                System.exit(0);
                
            }
            
            else {
                System.out.println("Don't Enter Anything other than integer");
            }
        }

        sc.close();
    }
}
