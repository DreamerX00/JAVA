package myjava;

import java.util.*;

public class exceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int choice = 4;
        System.out.println("""
                ----- Choose One of The following Tasks -----
                1. Enter All Prime Numbers Till Hundred
                2. Enter All 2^n where n is random
                3. Enter All 3^n where n is random
                4. Exit
                """);
        System.out.print("Enter your choice : -- ");
        try {
            choice = sc.nextInt();
            if (choice <= 0 || choice > 4){
                throw new myException();
            }
        }
        catch (myException e){
            System.out.println(e);
        }
        System.out.print("\n\n === Your Choice :- ");
        switch (choice) {
            case 1 -> System.out.println("Enter All Prime Numbers Till Hundred");
            case 2 -> System.out.println("Enter All numbers till n^2 where n is random");
            case 3 -> System.out.println("Enter All numbers till n^3 where n is random");
            case 4 -> System.exit(0);
        }
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        ArrayList<Integer> squares = new ArrayList<>();
        ArrayList<Integer> cubes = new ArrayList<>();
        checkStatus cs = new checkStatus();
        int inputNumbers;
        if (choice == 1){
            System.out.print("Start Typing ");
            try {
                for (int i = 0; i < 25 ; i++){
                    System.out.print("--> ");
                    inputNumbers = sc.nextInt();
                    boolean status = cs.primeNumbers(inputNumbers);
                    if (!status){
                        System.out.println("Your Wrong Input: "+inputNumbers);
                        throw new primeException();
                    }
                    else {
                            primeNumbers.add(i,inputNumbers);
                    }
                }
                System.out.println(primeNumbers);
            }
            catch (primeException e){
                System.out.println(e);
                Collections.sort(primeNumbers);
                System.out.println("Your Correct Inputs: "+primeNumbers);
            }
        }
        else if (choice == 2){
            int random = rd.nextInt(1,101);
            int square;
            System.out.println("Enter The squares of all number till "+random);
            try{
                for (int i = 1; i <= random; i++) {
                    System.out.print("--> ");
                    square = sc.nextInt();
                    boolean status = cs.squarePower(square,i);
                    if (!status){
                        System.out.println("Expected :- "+ Math.pow(i,2));
                        throw new squareException();
                    }
                    else {
                        squares.add(square);
                    }
                }
                System.out.println(squares);
            }
            catch (squareException e){
                System.out.println(e);
                Collections.sort(squares);
                System.out.println("your correct Input "+squares);
            }
        }
        else if (choice == 3){
            int random = rd.nextInt(1,101);
            int cube;
            System.out.println("Enter cubes of all number till "+random);
            try{
                for (int i = 1; i <= random; i++) {
                    System.out.print("--> ");
                    cube = sc.nextInt();
                    boolean status = cs.cubePower(cube,i);
                    if (!status){
                        System.out.println("Expected :- "+ Math.pow(i,3));
                        throw new cubeException();
                    }
                    else {
                        cubes.add(cube);
                    }
                }
                System.out.println(cubes);
            }
            catch (cubeException e){
                System.out.println(e);
                Collections.sort(cubes);
                System.out.println("your correct Input "+cubes);
            }
        }


    }
}
class myException extends Exception{
    @Override
    public String toString() {
        return super.toString() + " Number not Allowed";
    }
}
class primeException extends Exception{
    @Override
    public String toString(){
        return super.toString()+" This is Not A Prime Number";
    }
}
class squareException extends Exception{
    @Override
    public String toString() {
        return super.toString() + " Wrong Input";
    }
}
class cubeException extends Exception{
    @Override
    public String toString() {
        return super.toString() + " Wrong Input";
    }
}
class checkStatus{
    public boolean primeNumbers(int num){
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
    }
    public boolean squarePower(int num,int increment){
        return num == Math.pow(increment, 2) && num > 0;
    }
    public boolean cubePower(int num,int increment){
        return num == Math.pow(increment, 3) && num > 0;
    }
}


