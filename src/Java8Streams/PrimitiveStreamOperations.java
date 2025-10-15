package Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimitiveStreamOperations {
    static void main() {
         int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream numStream = Arrays.stream(numbers);
        numStream
                .average()
                .ifPresentOrElse(
                        avg->IO.println("Average is "+avg),
                        () -> IO.println("Not Present")
                );

        List<Double> list = new Random().doubles(10).boxed().toList();
        IO.println(list);

        Integer sum = new Random().ints(10).boxed().mapToInt(Integer::intValue).sum();
        IO.println(sum);

    }
}
