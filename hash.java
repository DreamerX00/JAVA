import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class hash {
    public static void stuff(HashSet<String> a,int capacity){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < capacity; i++) {
            System.out.print("Enter Element on index "+i+" --> ");
            a.add(sc.nextLine());
        }
    }
    public static void main(String[] args) {
        long current = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many Elements do you want to add : ");
        int capacity = sc.nextInt();
        HashSet<String> mySet = new HashSet<>(capacity , 0.5f);
        stuff(mySet,capacity);
        System.out.println("Element Added Successfully");
        int option = 0;
            while (option != 4){
                System.out.println("""
                    Enter Your choice:
                    1. Find Value
                    2. Print All
                    3. Add Value
                    4. Exit""");
                if (option > 4 || option < 0){
                    while (true){
                        option = sc.nextInt();
                    }
                }
                option = sc.nextInt();
                switch (option){
                    case 1->{
                        System.out.print("Type The Value you Want to Found -> ");
                        sc.nextLine();
                        String type = sc.nextLine();
                        System.out.println(mySet.contains(type));
                    }
                    case 2->{
                        System.out.println(mySet);
                    }
                    case 3->{
                            System.out.print("How Many Values Do you Want To Add : ");
                            int num = sc.nextInt();
                            stuff(mySet,num);
                    }
                    case 4->{
                        break;
                    }
                }
            }
        System.out.println(mySet);
        System.out.println("Total Time Elapsed = "+(System.currentTimeMillis()-current)/1000+" Seconds");

        }

}

