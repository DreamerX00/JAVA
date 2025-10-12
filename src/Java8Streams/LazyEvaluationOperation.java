package Java8Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationOperation {
    static void main() {
        Stream<String> countryNames = Stream.of("India","China","Japan","Russia","Korea","Indonesia")
                .filter(country ->{
                    IO.println("Filtering : "+country);
                    return country.toLowerCase().contains("i");
                });

        IO.println("=== Before Terminal Output ===");
        List<String> result = countryNames.collect(Collectors.toList());

        IO.println("=== After Terminal Output ===");
        IO.println(result);
    }
}
