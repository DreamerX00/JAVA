import java.util.InputMismatchException;
import java.util.Scanner;

public class nested_try {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Two Numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                System.out.println("Division of "+a+" and "+b+" results in : "+a/b);
            }
            catch (ArithmeticException m ){
                System.out.println("Mathematical Error Occurred : "+m);
            }

        }
        catch (InputMismatchException I){
            System.out.println("Input Error Occurred : "+I);
        }
    }
}
