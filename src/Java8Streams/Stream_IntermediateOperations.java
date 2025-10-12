package Java8Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Stream_IntermediateOperations {
    static void main() {
        List<String> names = List.of("Aarav", "Vivaan", "Aditya", "Ishaan", "Arjun", "Sai", "Ananya", "Diya", "Isha", "Myra");

        // Filter Intermediate Operation
        List<String> filteredNames = names.stream()
                .filter(str -> str.startsWith("A")).toList();
        System.out.println("Filtered Names: " + filteredNames); // [Aarav, Aditya, Arjun, Ananya]

        // Map Intermediate Operation
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase).toList();
        IO.println("UpperCase Names : " + upperCaseNames);

        // Sorted Intermediate Operation
        List<String> sortedNames = names.stream()
                .sorted().toList();
        IO.println("Sorted Names : " + sortedNames);

        //Sorted Intermediate Operation (Custom Comparator)
        List<String> customSortedNames = names.stream()
                .sorted((x, y) -> x.length() - y.length())
                .toList();
        IO.println("Custom Sorted Names : " + customSortedNames);

        //Distinct Intermediate Operation
        List<String> distinctNames = Stream.of("Aarav", "Vivaan", "Aditya", "Ishaan", "Arjun", "Sai", "Ananya", "Diya", "Isha", "Myra", "Aarav", "Ishaan", "Arjun", "Sai", "Ananya", "Diya", "Isha", "Myra")
                .distinct()
                .toList();

        IO.println("Distinct Names : " + distinctNames);

        //Limit Intermediate Operation
        List<String> limitedNames = names.stream()
                .limit(2)
                .toList();

        IO.println("Limited Names : " + limitedNames);

        //Skip Intermediate Operation
        List<String> skippedNames = names.stream()
                .skip(4)
                .toList();

        IO.println("Skipped Names : " + skippedNames);

        //Peek Intermediate Operation
        List<String> peekNames = names.stream()
                .peek(str -> IO.println("Found The Name : "+str))
                .skip(100)
                .toList();
        IO.println(peekNames);

        //Flat Map Operation
         List<List<String>> listOfListOfMovies = Arrays.asList(
            Arrays.asList("Inception", "Interstellar", "Tenet"), // Sci-Fi
            Arrays.asList("The Godfather", "Goodfellas", "Scarface"), // Crime
            Arrays.asList("The Dark Knight", "Batman Begins", "Joker"), // Superhero
            Arrays.asList("Parasite", "Oldboy", "Train to Busan"), // Korean
            Arrays.asList("Toy Story", "Finding Nemo", "Up"), // Animation
            Arrays.asList("Titanic", "The Notebook", "La La Land"), // Romance
            Arrays.asList("Gladiator", "Braveheart", "Troy"), // Historical
            Arrays.asList("Get Out", "A Quiet Place", "Hereditary") // Horror
        );

         listOfListOfMovies.stream()
                 .flatMap(Collection::stream)
                 .skip(2)
                 .map(String::toUpperCase)
                 .forEach(IO::println);


    }
}
