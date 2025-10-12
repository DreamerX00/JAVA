package Java8Streams;

import module java.base;
public class StreamOperations {
    //feature introduction in Java 8
    //Stream API to process collections of objects
    //Supports functional-style operations on streams of elements
    //Can be used to perform operations like filter, map, reduce, find, match, sort, and collect
    //Can be executed either sequentially or in parallel
    //Simplify Data Processing
    //Improved Readability
    //Parallel Processing
    //Lazy Evaluation
    //Pipelining
    //Reduction Operations
    //Enhanced Productivity
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //Filter even numbers
        IO.println(numbers.stream().filter(x -> x % 2 == 0).count());

        //Creating Streams
        //From Collections
        List<String> mylist = List.of("a", "b", "c", "d", "e");
        Stream<String> stream = mylist.stream();
        IO.println("From Collection:");
        stream.forEach(IO::println);

        //From Array
        String[] array = {"a", "b", "c", "d", "e"};
        Stream<String> arrayStream = Arrays.stream(array);
        IO.println("From Array:");
        arrayStream.forEach(IO::println);

        //Using Stream.of()
        Stream<String> myStream = Stream.of("a", "b", "c", "d", "e");
        IO.println("Using Stream.of():");
        myStream.forEach(IO::println);

        //Infinite Streams
        Stream<Integer> infiniteStream = Stream.generate(() -> 1).limit(5);
        Stream<Integer> infiniteStream2 = Stream.iterate(1, n -> n + 2).limit(5);
        IO.println("Infinite Streams Using .generate :");
        infiniteStream.forEach(IO::println);
        IO.println("Infinite Streams Using .iterate :");
        infiniteStream2.forEach(IO::println);

    }
}
