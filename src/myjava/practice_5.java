package myjava;

import java.util.Scanner;

public class practice_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int query , a , b , n;
        query = sc.nextInt();
        for (int j = 0; j < query; j++) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            int series = a;
            for (int i = 0; i <= n - 1; i++) {
                int power = (int)Math.pow(2,i);
                int operation = (b*power);
                series = series + operation;
                System.out.print(series+" ");
            }
            System.out.println();
        }

    }
}
