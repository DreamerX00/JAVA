package myjava;

import java.util.Scanner;

public class practice_set_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // problem 3
//            int[] boxes = {2,4,7,8};
//            int range = boxes.length - 1;
//        System.out.println(range);
//            System.out.print("Enter The Range : ");
//            int input = sc.nextInt();
//            for (int i = 1;input > 3;++i){
//                System.out.println("Retry : "+i+"\n");
//                input = sc.nextInt();
//                if (i > 4){
//                    System.out.println("Error");
//                    break;
//                }
//            }
//        System.out.println(" Number on Index "+input+" is "+boxes[input]);

        // problem 4
//        try {
//            int[] boxes = {2,4,7,8};
//            int range = boxes.length - 1;
//            System.out.println(range);
//            System.out.print("Enter The Range : ");
//            int input = sc.nextInt();
//            for (int i = 1;input > 3;i++){
//                System.out.println("Retry : "+i+"\n");
//                input = sc.nextInt();
//                if (i > 4){
//                    System.out.println("Error");
//                    throw new IndexOutOfBoundsException();
//                }
//            }
//        }
//        catch (IndexOutOfBoundsException IobE){
//            System.out.println(IobE + " Try Again ");
//        }

        //problem 5
        try {
            int[] boxes = {2,4,7,8};
            int range = boxes.length - 1;
            System.out.println(range);
            System.out.print("Enter The Range : ");
            int input = sc.nextInt();
            for (int i = 1;input > 3;i++){
                System.out.println("Retry : "+i+"\n");
                input = sc.nextInt();
                if (i > 4){
                    System.out.println("Error");
                    throw new indexInvalidException();
                }
            }
        }
        catch (indexInvalidException iIE){
            System.out.println(iIE + " Try Again ");
        }
    }
}
class indexInvalidException extends Exception{
    @Override
    public String toString() {
        return "Your Index Input Is Invalid";
    }
}
