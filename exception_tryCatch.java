import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_tryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][][] Store = new int[4][4][4];
        System.out.println("Let's Add Some Values First :- ");
        System.out.print("Enter The Position : ");
        int oneD = sc.nextInt();
        int twoD = sc.nextInt();
        int threeD = sc.nextInt();
        System.out.println();
        System.out.println("Enter The Value on Position : A"+oneD+twoD+threeD);
        try {
            Store[oneD][twoD][threeD] = sc.nextInt();
            System.out.println("The Value on : "+oneD+twoD+threeD+" is "+Store[oneD][twoD][threeD]);
        }
        catch (IllegalArgumentException I){
            System.out.println("Argument Error Occurred : "+I);
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Index Error Occurred : "+a );
        }
        catch (InputMismatchException n){
            System.out.println("Datatype Error Occurred : "+n);
        }
        catch (Exception e){
            System.out.println("Some Exception Occurred : "+e);
        }
    }
}
