import java.util.Scanner;
class test{
    public static void main(String[] args){
    str s = new str();
        System.out.println("Make Lower Case");
        s.low();
        System.out.println("Replace The Space");
        s.replace();
        System.out.println("Fill Your Name");
        s.fill();

    }
}

class str{
    Scanner sc = new Scanner(System.in);
    String A;
    void low(){
        A = sc.nextLine();
        System.out.println(A.toLowerCase());
    }
    void replace(){
        A = sc.nextLine();
        System.out.println(A.replace(" ","__"));
    }
    void fill(){
        String B = "Dear <|Name|>, Thanks A Lot!";
        A = sc.nextLine();
        System.out.println(B.replace("<|Name|>",A));
    }
    void detect(){
        A = sc.nextLine();
        System.out.println();
        System.out.println();
    }
}
