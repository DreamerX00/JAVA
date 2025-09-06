package myjava;

import java.util.Scanner;
interface Data{
    int user = 100;
    void getName();
    void displayName();
}
class duty implements Data{
    Scanner sc = new Scanner(System.in);
    String Name;
    int age;
    public void getName(){
        System.out.print("Enter Your Name Please : ");
        Name = sc.nextLine();
        System.out.print("Enter Your Age Please : ");
        age = sc.nextInt();
    }
    public void displayName(){
        System.out.println("Hi "+Name+" Your Name is added to our data base which contains only top "+user+" You will now officially work on this mission and you will retire at the age of "+(age+30)+" \n\nStart Your Work Now ==> ");
    }
}
public class INTERFACE {
    public static void main(String[] args) {
        duty d = new duty();
        d.getName();
        d.displayName();
    }
}
