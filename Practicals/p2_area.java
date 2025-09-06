package Practicals;

public class p2_area {
    public static void main(String[] args) {
        CArea c = new CArea();
        c.area();
        c.area(40);
        c.area(24,35);
    }
}
class CArea{
    int length = 48;
    int breadth = 24;
    void area(){
        System.out.println("Area of Triangle is --> "+(length*breadth)/2);
    }
    void area(int len){
        System.out.println("Area of Square is --> "+len*len);
    }
    void area(int lent,int bdth){
        System.out.println("Area of Rectangle is --> "+lent*bdth);
    }



}
