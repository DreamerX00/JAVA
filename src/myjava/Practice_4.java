package myjava;

import java.util.Scanner;

interface smartTVRemote{
    default void Netflix(){
        System.out.println("Opening Netflix.....");
    }
    void voiceAssistant();
}
interface TVRemote extends smartTVRemote{
    default void turnOn(){
        System.out.println("Turns on the Tv.......");
    }
    void turnOff();
}
class Remote implements TVRemote{
    public void turnOff(){
        System.out.println("Turn off The TV bro");
    }
    public void voiceAssistant(){
        System.out.println("Turn on Google Assistant");
    }
}
public class Practice_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        double b;
        String c;
        a = sc.nextInt();
        sc.nextLine();
        b = sc.nextDouble();
        sc.nextLine();
        c = sc.nextLine();

        System.out.println("String: "+c+"\nDouble: "+b+"\nInt: "+a);
    }
}
