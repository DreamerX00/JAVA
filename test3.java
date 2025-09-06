import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        for (int i = 0 ; i < 20 ;i++ ){
            System.out.print("\n");
            for (int j = 20; j > i; j--) {
                System.out.print("* ");
            }
        }
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        salary s = new salary();
//        int choice;
//        for (int i = 1;i < 100 ;i++){
//            System.out.println("""
//                    === Welcome To Useless Stuff Please Select one of the Following Options :-\s
//                    1.SET Name\s
//                    2.SET Salary\s
//                    3.UPDATE Name\s
//                    4.DISPLAY Data\s
//                    ------------------------""");
//            choice = sc.nextInt();
//            if (choice > 0 && choice <= 4){
//                switch (choice) {
//                    case 1 -> s.getName();
//                    case 2 -> s.getsalary();
//                    case 3 -> s.setName();
//                    case 4 -> s.Display();
//
//                }
//            } else if (choice > 4) {
//                System.exit(0);
//
//            } else{
//                System.out.println("choice Invalid");
//            }
//        }
//        sc.close();
//    }
//    static class salary{
//        Scanner sc = new Scanner(System.in);
//        public int salary;
//        void getsalary(){
//            System.out.println("Please Enter Your Salary Amount below :- ");
//            salary = sc.nextInt();
//        }
//        public String name;
//        void getName(){
//            System.out.println("Please Enter Your Good Name Below :- ");
//            name = sc.nextLine();
//        }
//        public String uname;
//        void setName(){
//            System.out.println("Please Enter Your Updated Name Below :- ");
//            uname = sc.nextLine();
//        }
//
//        void Display(){
//            System.out.println("Name ==> "+name);
//            System.out.println("Salary ==> "+salary);
//            System.out.println("Updated Name ==> "+uname);
//        }
//    }
}
