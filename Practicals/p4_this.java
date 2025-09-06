package Practicals;
class sum{
    int a = 48;
    int b = 67;
    int c = a+b;
    public int add(){
        return c;
    }
    public int sub(int a, int b){
        c = this.a + this.b;
        return c;
    }
}
public class p4_this {
    public static void main(String[] args) {
        sum s = new sum();
        System.out.println("Addition without this keyword : "+s.add());
        System.out.println("Addition with this keyword : "+s.sub(66,80));
    }
}
