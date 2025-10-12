package Java8Streams;

import java.util.function.Function;

public class FunctionOperations {
    static void main() {
        Function<Integer,String> validAge = age -> age >= 18 ? "Eligible to Vote" : "Not Eligible to Vote";

        IO.println(validAge.apply(22)); // Eligible to Vote
        IO.println(validAge.apply(12)); // Not Eligible to Vote

        Function<String,String> addPrefix = name -> "Mr. "+name;
        Function<String,String> toUpperCase = String::toUpperCase;
        Function<String,String> toBinary = name -> {
            StringBuilder binary = new StringBuilder();
            for(char c : name.toCharArray()){
                binary.append(Integer.toBinaryString(c));
            }
            return binary.toString();
        };

        Function<String,String> finalNameFunction = addPrefix.andThen(toUpperCase).andThen(toBinary);

        IO.println("Final Name Function : "+finalNameFunction.apply("Akash"));
        IO.println("Indentity Function : "+Function.identity().apply("Akash"));


    }
}
