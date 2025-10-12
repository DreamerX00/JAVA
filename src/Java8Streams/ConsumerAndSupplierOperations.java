package Java8Streams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerAndSupplierOperations {
    static void main() {
        //Consumer
        Consumer<Integer> printSquare = n -> System.out.println(n*n);
        printSquare.accept(5); // 25
        printSquare.accept(12); // 144

        //Supplier
        Supplier<Integer> rollDice = () -> (int)(Math.random()*6)+1;
        System.out.println("Dice Roll : "+rollDice.get());
        System.out.println("Dice Roll : "+rollDice.get());
        System.out.println("Dice Roll : "+rollDice.get());


        //Let's Build A Switch
        Predicate<String> isOn = state -> state.equalsIgnoreCase("ON");
        Function<Boolean,String> messageInitiate = state -> state ? "Switch is ON" : "Switch is OFF";
        Consumer<String> createLog = log -> IO.println("Current State Logged : "+log);
        Supplier<String> endMessage = () -> "Switching Operation Completed";

        createLog.accept(messageInitiate.apply(isOn.test("ON")));
        createLog.accept(messageInitiate.apply(isOn.test("OFF")));
        IO.println(endMessage.get());




    }
}
