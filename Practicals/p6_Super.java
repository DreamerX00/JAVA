package Practicals;

public class p6_Super {
    public static void main(String[] args) {
        college c = new college();
        c.stats();
    }
}
class university{
    int course = 12;
    int students = 89;
    int fee = 1000000;
    university(){
        System.out.println("This is called for data check in base class");
    }
}
class college extends university{
    int course = 2;
    int students = 100;
    int fee = 12000;
    void stats(){
        System.out.println("we have total "+super.course+" courses and "+students+"  students "+super.fee+" fees");
    }
    college(){
        System.out.println("This is called for child class ");
    }
}
