import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Dict = new ArrayList<>();
        System.out.print("How Many Words Would You Like To Add In The Dictionary : ");
        int capacity = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < capacity; i++) {
            Dict.add(sc.nextLine());
        }
        while (true){
            System.out.println();
            System.out.println("""
                Your Dictionary is Ready :--
                1. See All The Words
                2. Sort It Alphabetically
                3. Check any Word's Presence
                4. Check The Index of a Word
                5. Add any word
                6. Remove any word
                7. show in a table format
                8. Set any word
                9. Exit""");
            System.out.print("--> ");
            int option = sc.nextInt();
            System.out.println(" ");
            switch (option) {
                case 1 -> {
                    for (int i = 0; i < Dict.size(); i++) {
                        System.out.print(Dict.get(i)+" ");
                    }
                }
                case 2 -> {
                    Collections.sort(Dict);
                    System.out.println("Sorting Complete");
                }
                case 3 -> System.out.println(Dict.contains(sc.next()));
                case 4 -> System.out.println(Dict.indexOf(sc.next()));
                case 5 -> {
                    Dict.add(sc.next());
                    System.out.println("Word Added Successfully");
                }
                case 6 -> Dict.remove(sc.nextInt());
                case 7 -> {
                    System.out.println("""
                            Index   ||    Words
                            -------------------
                            """);
                    for (int i = 0;i < Dict.size();i++){
                        System.out.println(i+"            "+Dict.get(i));
                    }
                }
                case 8 -> Dict.set(sc.nextInt(), sc.next());
                case 9 -> System.exit(0);
            }
        }
    }
}
