package Java8Streams;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class CollectorOperations {
    static void main() {
        //Collector is a utility Class
        // provides set of methods to create common collectors

        List<String> names = List.of("Akash", "Atul", "Tanisha", "Karan", "Himanish");

        // Collecting To List
        List<String> nameList = names.stream().map(String::toUpperCase).collect(Collectors.toList());

        // Collecting To Set
        Set<String> setNames = names.stream().collect(Collectors.toSet());

        // Collecting To Collection
        ArrayList<String> arrayListNames = names.stream().collect(Collectors.toCollection(ArrayList::new));

        // Joining String
        String concatinatedString = names.stream()
                .filter(str -> str.startsWith("A"))
                .collect(Collectors.joining(" / "));
        IO.println(concatinatedString);

        //Summarizing Data
        List<Integer> myMarks = List.of(12, 88, 55, 65, 23);
        IntSummaryStatistics statistics = myMarks.stream().collect(Collectors.summarizingInt(Integer::intValue));
        IO.println(
                String.format("Average marks : %.2f%n" +
                                "Sum total of Marks Is : %d%n" +
                                "Min Marks In The List : %d%n" +
                                "Max Marks In The List : %d%n" +
                                "Total Subjects Are : %d%n",
                        statistics.getAverage(),
                        statistics.getMin(),
                        statistics.getMax(),
                        statistics.getMin(),
                        statistics.getCount()
                )
        );

        //Directly Getting Statics
        double marksAverage = myMarks.stream().collect(Collectors.averagingInt(x -> x));
        IO.println(marksAverage);

        Long countSubjects = myMarks.stream().collect(Collectors.counting());
        IO.println(countSubjects);

        //Grouping Elements

        List<String> subjectNames = List.of("English","Hindi","Mathematics","Science","Social Science");
        IO.println(subjectNames);
        IO.println(
                subjectNames.stream().collect(Collectors.groupingBy(String::length))
        );

        IO.println(
                subjectNames.stream().collect(Collectors.groupingBy(String::length,Collectors.joining(" And ")))
        );

        TreeMap<Integer, Long> countTreeMap = subjectNames.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));

        IO.println(countTreeMap);

        //Partitioning Elements
        IO.println(subjectNames.stream()
                .collect(Collectors
                        .partitioningBy(str-> str.contains("a"))
                )
        );

        //Mapping and Collecting
        IO.println(subjectNames.stream().
                collect(Collectors.
                        mapping(String::toUpperCase, Collectors.toList())
                )
        );

    }
}
