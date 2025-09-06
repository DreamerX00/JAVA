import java.util.Scanner;
class practice2{
    public static void main(String[] args){
        test2 t = new test2();
        t.table();
        t.design();
        System.out.println(t.recurs(18));
        t.reverse();
    }
}
class test2{
    Scanner sc = new Scanner(System.in);
    public int n;
    void table(){
        System.out.println("Enter The Number To Get Multiplication Table");
        n = sc.nextInt();
        for (int i = 0; n >= 0 && i <= 10;i++){
            int multi;
            multi = n*i;
            System.out.println(n + " X " +i+ " = "+multi);
        }
        System.out.println("\nDone!");
    }
    void design(){
        System.out.println("Enter The Length of the pattern ");
        n = sc.nextInt();
        for(int i = 0; i <= n ;i++){
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    void reverse(){
        System.out.println("Enter The Length of the pattern ");
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    int recurs(int n){
        if (n == 1){
            return 1;
        }
        return n + recurs(n-1);
    }

}