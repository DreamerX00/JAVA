import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator cal = new calculator();
        while (true){
            cal.menu();
            int option = 5;
            try {
                System.out.print("Enter your Choice : ");
                try {
                    option = sc.nextInt();
                }
                catch (InputMismatchException e){
                    System.out.println("Bro You Dumb or What!");
                }

                if (option > 5 || option < 1){
                    System.exit(0);
                }
                else {
                    switch (option) {
                        case 1 -> {
                            System.out.println("Addition");
                            cal.input();
                            cal.add();
                        }
                        case 2 -> {
                            System.out.println("Multiplication");
                            cal.input();
                            if (cal.a > 7000 || cal.b > 7000) {
                                throw new maxMultiplyingReached();
                            } else {
                                cal.multi();
                            }
                        }
                        case 3 -> {
                            System.out.println("Division");
                            cal.input();
                            if (cal.b == 0) {
                                throw new ArithmeticException();
                            } else {
                                cal.div();
                            }
                        }
                        case 4 -> {
                            System.out.println("Subtraction");
                            cal.input();
                            cal.sub();
                        }
                        case 5 -> {
                            sc.close();
                            System.exit(0);
                        }
                    }
                }
            }
            catch (ArithmeticException ae){
                System.out.println(" Divide by 0 is not possible ");
            }
            catch (maxMultiplyingReached mMR){
                System.out.println(mMR);
            }
            catch (InputMismatchException iME){
                System.out.println(" Really Bro!");
            }
    }   }
}
class maxInputReached extends Exception{
    @Override
    public String toString() {
        return "Number should be less than 100000";
    }
}
class maxMultiplyingReached extends Exception{
    @Override
    public String toString() {
        return "Input should be less than 7000";
    }
}
class calculator{
    Scanner sc = new Scanner(System.in);
    public int a,b;
    public void menu(){
        System.out.println("""
                Select One of The Following Options
                1. Addition
                2. Multiplication
                3. Division
                4. Subtraction
                5. Exit""");
    }
    public void input(){
        try {
            System.out.print("Enter your First Number : ");
            a = sc.nextInt();
            System.out.print("Enter your Second Number : ");
            b = sc.nextInt();
            if (a > 100000 || b > 100000){
                throw new maxInputReached();
            }
        }
        catch (maxInputReached mIR){
            System.out.println(mIR);
            System.exit(0);
        }

    }
    void add(){
        System.out.println("Addition of "+a+" and "+b+" is : "+(a+b));
    }void sub(){
        System.out.println("Subtraction of "+a+" and "+b+" is : "+(a-b));
    }void div(){
        System.out.println("Division of "+a+" and "+b+" is : "+(a/b));
    }void multi(){
        System.out.println("Multiplication of "+a+" and "+b+" is : "+(a*b));
    }
}