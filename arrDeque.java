import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class arrDeque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of the List : ");
        int size = sc.nextInt();
        sc.nextLine();
        ArrayDeque<String> myArr = new ArrayDeque<>(size);
        ArrayList<String> newArr = new ArrayList<>();
        for (int i = 0;i < size;i++){
            System.out.print("Enter the value on index ["+i+"] : ");
            myArr.addFirst(sc.nextLine());
            System.out.println();
        }
        int choice = 0;
        while (choice != 6){
            System.out.println("""
                    Choose one of The Following
                    1. Add Elements from first
                    2. Add Elements from last
                    3. Add Different Collection
                    4. Remove Elements
                    5. Print All Elements
                    6. Exit""");
            System.out.println("\n\nEnter Your choice\n--> ");
            choice = sc.nextInt();
            switch (choice){
                case 1->{
                    System.out.print("Enter The Number of Elements you want to add --> ");
                    int elem = sc.nextInt();
                    for (int i = 0; i < elem ; i++){
                        myArr.addFirst(sc.nextLine());
                        sc.nextLine();
                    }
                }
                case 2->{
                    System.out.print("Enter The Number of Elements you want to add --> ");
                    int elem = sc.nextInt();
                    for (int i = 0; i < elem ; i++){
                            myArr.addLast(sc.nextLine());
                            sc.nextLine();
                    }
                    System.out.println(myArr.getLast());
                }
                case 3->{
                    System.out.print("Enter The Number of Elements You Want in New Collection\n--> ");
                    int limit = sc.nextInt();
                    for (int i = 0; i < limit; i++) {
                        System.out.print("Enter Element no. "+i+" --> ");
                        sc.nextLine();
                        newArr.add(sc.nextLine());
                    }
                    myArr.addAll(newArr);
                    System.out.println("Collection Added Successfully");
                }
                case 4->{
                    System.out.print("Enter The Element You Want To Remove --> ");
                    sc.nextLine();
                    String element = sc.nextLine();
                    myArr.remove(element);
                    System.out.println("Element "+element+" is Successfully removed");
                }
                case 5 ->{
                    myArr.forEach((n)-> System.out.println(n));
                }
                case 6 -> {
                    break;
                }
            }
        }
        myArr.forEach(System.out::println);
    }
}
