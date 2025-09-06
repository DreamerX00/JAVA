package myjava;

import java.util.Scanner;

public class practice_set_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a Number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter a Number : ");
            int num2 = sc.nextInt();
            if (num1 < 0 && num2 < 0){
                throw new IllegalArgumentException();
            }
            System.out.println("Division of "+num1+" and "+num2+" gives "+num1/num2);
        }
        catch (ArithmeticException ar){
            System.out.println("HaHa");
        }
        catch (IllegalArgumentException iae){
            System.out.println("HeHe");
        }
    }
}
