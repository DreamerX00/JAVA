package myjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class throw_throws {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Your First Number : " );
            int num1 = sc.nextInt();
            System.out.print("Enter Your Second Number : ");
            int num2 = sc.nextInt();
            division(num1,num2);
        }
        catch (negativeNumberException | InputMismatchException e){
            System.out.println(e);
        }
    }
    static void division(int num1, int num2) throws negativeNumberException{
        if (num2 < 0){
            throw new negativeNumberException();
        }
        System.out.println("Your Answer is : "+num1/num2);
    }
}
class negativeNumberException extends Exception{
    @Override
    public String toString() {
        return "Negative Number is not allowed";
    }
}
