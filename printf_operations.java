import java.util.Scanner;

public class printf_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b,c;
        int a1,b1,c1;
        a = sc.next();
        a1 = sc.nextInt();
        b = sc.next();
        b1 = sc.nextInt();
        c = sc.next();
        c1 = sc.nextInt();
        System.out.println("================================");
        System.out.printf("%-15s",a);System.out.printf("%03d",a1);
        System.out.printf("\n%-15s",b);System.out.printf("%03d",b1);
        System.out.printf("\n%-15s",c);System.out.printf("%03d",c1);
        System.out.println("\n================================");

    }
}
