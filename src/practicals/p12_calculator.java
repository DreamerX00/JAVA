package practicals;

import java.util.Scanner;

public class p12_calculator {
    public static void main(String[] args) {
        int first,second;
        Scanner sc = new Scanner(System.in);
        int option;
        for(int i = 1 ; i < 100 ; i++){
            System.out.println("""
                    Choose One of The following :
                    1.Addition
                    2.Subtraction
                    3.Multiplication
                    4.Division
                    5.Exit
                    """);
            System.out.print("Enter your Choice ==>  ");
            option = sc.nextInt();
            System.out.println("==================================");

            System.out.print("Enter 1st Number : ");
            first = sc.nextInt();
            System.out.print("Enter 2nd Number : ");
            second = sc.nextInt();

            System.out.println("==================================");
            switch (option) {
                case 1 ->
                        System.out.println("Your Answer To Additon of " + first + " and " + second + " is = " + (first + second));
                case 2 ->
                        System.out.println("Your Answer To Subtraction of " + first + " and " + second + " is = " + (first - second));
                case 3 ->
                        System.out.println("Your Answer To Multiplication of " + first + " and " + second + " is = " + (first * second));
                case 4 ->
                        System.out.println("Your Answer To Division of " + first + " and " + second + " is = " + (first / second));
                case 5 -> System.exit(0);
            }
        }
    }
}
