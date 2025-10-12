package Java8Streams;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicate_BiFunction_BiConsumer_Operations {
    static void main() {
        Scanner sc = new Scanner(System.in);
        // BiConsumer
        BiConsumer<Integer, Integer> printSum = (a, b) -> System.out.println(a + b);
        printSum.accept(5, 10); // 15

        // BiFunction
        BiFunction<Integer,Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiply.apply(5, 10)); // 50

        //BiPredicate
        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
        System.out.println("Is 10 greater than 5? " + isGreater.test(10, 5)); // true
        System.out.println("Is 3 greater than 7? " + isGreater.test(3, 7)); // false

        //Let's Have A Combined Example
        BiPredicate<Integer, Integer> isInRange = (num, range) -> num >= 0 && num <= range;
        BiFunction<Boolean, String, String> newMessage = (status, name) ->
            status ? "Congratulations " + name + ", you are within the specified age range!"
                   : "Sorry " + name + ", you are out of the specified age range.";
        BiConsumer<String, String> displayMessage = (msg, name) ->
            System.out.println("Message for " + name + ":" +
                "\n=============================================================\n" +
                "\t\t" + msg +
                "\n=============================================================");

        displayMessage.accept(newMessage.apply(isInRange.test(sc.nextInt(), sc.nextInt()), sc.nextLine()), sc.nextLine());



    }
}
