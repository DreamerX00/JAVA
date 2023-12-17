import java.util.Arrays;
import java.util.Scanner;


class first{
    public static void main(String args[]) {
        System.out.println("Hellow Bro");
        String Name = "Brother i am stuck";
        int age = 18;
        String Address = "RK Puram";

        System.out.println(Name);
        System.out.println(age);
        System.out.println(Address);

        String Concat = Name + " " +Address;
        System.out.println(Concat);
        System.out.println(Address.length());
        System.out.println(Name.charAt(0));

        String Modified = Address.replace("Puram", "Khanna");
        System.out.println(Modified);
        String sub = Address.substring(0,3);
        System.out.println(sub);

        String[] Subjects = new String[12];
        Subjects[0] = "Maths";
        Subjects[1] = "English";
        Subjects[2] = "C++";
        Subjects[3] = "Architechure";
        Subjects[4] = "Java";
        Subjects[5] = "Data Algos.";

        System.out.println(Subjects[5]);
        int[] values = new int[5];
        values[0] = 12;
        values[1] = 8;
        values[2] = 10;
        values[3] = 1;
        values[4] = 55;

        System.out.println(values[0]);
        Arrays.sort(values);
        System.out.println(values[0]);

        String[][][] store = {
            {
                {"Akash","Singh"},
                {"Nitin","Gahlot"},
                {"Rakshit","Kumar"}
            },
            {
                {"Thomas","Edison"},
                {"Albert","Aktar"},
                {"Stephen","Kayokin"}
            }
        };
        System.out.println(store[1][1][1]);

        System.out.println(store[0][2][0]);

        double bch = 18.90;
        System.out.printf("This is The Numbher = %f",bch);
        final double hoes = 20.99;
        System.out.printf("\nThis Varaible is constant because of final keyword = %f",hoes);

        int first = (int)(Math.random()*100000);
        int second = (int)(Math.random()*100000);

        int add = first + second;
        int subt = first - second;
        float div = first / second;
        int mult = first * second;
        int mod = first % second;
        
        System.out.printf("\nAddition :- %d\nSubtraction :- %d\nDivision :- %.2f\nMultiplication :- %d\nModulus :- %d\n",add,subt,div,mult,mod);

        System.out.println(Math.min(add, subt));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number : - ");
        int a  = sc.nextInt();
        System.out.println(a);

        
          
    }

}