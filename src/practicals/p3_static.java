package practicals;

public class p3_static {
    public static void main(String[] args) {
        stat.sum();
        stat.sum1();
    }
}
class stat{
    static int num1;
    static int num2;
    // num1 += num2; this will throw error because of static variable
    static void sum(){
        System.out.println("numbers are : "+num1 + " and " + num2);
        num1 += num2;
        System.out.println(num1);
    }//it is a block , so it won't throw any error
    static {
        num1 = 50;
        num2 = 90;
    }
    static void sum1(){
        System.out.println("Sum of num1 and num2 ==> "+(num1+num2));
    }//this is a static block used to quickly declare static variables

}