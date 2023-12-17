package Practicals;

import java.util.Scanner;

public class p1_rectangle {
    public static void main(String[] args) {
        rectangle rec = new rectangle();
        rec.input();
        rec.output();
    }
}
class rectangle{
    Scanner sc = new Scanner(System.in);
    int length;
    int breadth;
    void input(){
        System.out.print("Please Enter The Length of The Rectangle : ");
        length = sc.nextInt();
        System.out.print("Please Enter The Breadth of The Rectangle : ");
        breadth = sc.nextInt();
    }
    void output(){
        System.out.println("your answer for the area of rectangle is ==> " + calcArea());
    }
    int calcArea(){
        return length*breadth;
    }
}
