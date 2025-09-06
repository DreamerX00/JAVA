package myjava;

import java.util.Scanner;

/**
 * This Is A Sample Java Doc To Test All Tags Function In This Java
 * @author DreamerX AKA Akash Singh
 * @since 2023
 * @version 20.1
 * @see <a href = "https://www.youtube.com/@DreamerX0/" taget = "_blank">My Youtube Channel</a>
 */
public class javaDocTags {
   static Scanner sc = new Scanner(System.in);
    public static int num1,num2;
    public static void calculation(){
        System.out.println("Enter Your 1st Number :- ");
        num1 = sc.nextInt();
        System.out.println("Enter Your 2nd Number :- ");
        num2 = sc.nextInt();
    }

    /**
     * This way I can add description in between the classes to define it's working
     * @param a This is used to describe any parameter of a function
     * @return You can describe the return statement working
     * @throws Exception describes the exception thrown in any function or class
     * @deprecated This will highlight if a function is still usable or useless
     */
    public int testOperation2(int a, int b) throws Exception{
        if (a>b){
            throw new Exception();
        }
        return a+b;
    }
    static class testOperations{
        public int addition(){
            return num1+num2;
        }public int subtraction(){
            return num1-num2;
        }public int multiplication(){
            return num1+num2;
        }public int division(){
            return num1+num2;
        }

    }
    public static void main(String[] args) {
        calculation();
        testOperations to = new testOperations();
        System.out.println(to.addition());
        System.out.println(to.multiplication());
    }
}
