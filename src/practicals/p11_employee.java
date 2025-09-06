package practicals;

import java.util.Scanner;

public class p11_employee {
    public static void main(String[] args) {
        employee e = new employee();
        e.getdata();
        e.showdata();
    }
}
class employee{
    Scanner sc = new Scanner(System.in);
    String Name;
    String Address;
    int age;
    void getdata(){
        System.out.print("Enter your Name : ");
        Name = sc.nextLine();
        System.out.print("Enter Your Address : ");
        Address = sc.nextLine();
        System.out.print("Enter Your Age : ");
        age = sc.nextInt();
    }
    void showdata(){
        System.out.println("Name : "+Name+"\nAddress : "+Address+"\nAge : "+age);
    }
}