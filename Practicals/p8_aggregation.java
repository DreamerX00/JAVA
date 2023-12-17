package Practicals;

public class p8_aggregation {
    public static void main(String[] args) {
        Circle c=new Circle();
        double result=c.area();
        System.out.println(result);
    }
}
class Operation{
    int square(){
        return 5 * 5;
    }
}

class Circle{
    Operation op;//aggregation
    double pi=3.14;

    double area(){
        op=new Operation();
        int rsquare=op.square();
        return pi*rsquare;
    }
}
