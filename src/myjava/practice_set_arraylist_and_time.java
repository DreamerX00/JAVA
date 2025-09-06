package myjava;

import java.time.LocalDateTime;
import java.util.*;
public class practice_set_arraylist_and_time {
    public static void main(String[] args) {
        System.out.println("Hello User!! \n\nPlease Enter The Name of 10 Students:");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Student = new ArrayList<>();

        for (int i = 1 ; i <= 10; i++){
            System.out.print(i+". ");
            Student.add(sc.nextLine());
        }

        Student.forEach(elements -> System.out.print(elements+" "));
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        System.out.println("\n"+cal.getTime());
        LocalDateTime lt = LocalDateTime.now();
        System.out.println(lt);
        System.out.print("Enter The Amount of Elements you want to store : ");
        int userInput = sc.nextInt();
        Set<Integer> Stored = new HashSet<>();
        for (int i = 1; i <= userInput; i++){
            System.out.print(i+". ");
            Stored.add(sc.nextInt());
        }
        Stored.forEach(System.out::println);
    }
}
