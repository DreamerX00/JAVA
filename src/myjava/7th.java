package myjava;
import java.util.Scanner;
interface client
{
    void input();
    void output();
}
class dev implements client
{
    String name;
    int age;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = sc.nextLine();
        System.out.print("Enter your Age : ");
        age = sc.nextInt();
    }
    public void output(){
        System.out.println("your name is "+name+" And you were born in "+(2023-age));
    }
}
class seven{
    public static void main(String[] args) {
        client c = new dev();
        c.input();
        c.output();
    }
}

