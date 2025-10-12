package testing_codes;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    static void main() {
        //Arrays.fill example
        int[] arr = new int[10];
        Arrays.fill(arr, 10);
        System.out.println(Arrays.toString(arr)); // Output: [10, 10, 10, 10, 10, 10, 10, 10, 10, 10]

        int choice = 0;
        switch (choice){
            case 0:
                System.out.println("Choice is 0");
                break;
            case 1:
                System.out.println("Choice is 1");
                break;
            default:
                System.out.println("Default case");
        }

        switch (choice){
            case 0 -> System.out.println("Choice is 0");
            case 1 -> System.out.println("Choice is 1");
            default -> System.out.println("Default case");
        }


    }
}
