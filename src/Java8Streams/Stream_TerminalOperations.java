package Java8Streams;

import module java.base;

public class Stream_TerminalOperations {
    static void main() {
        List<String> companyNames = List.of("Google", "Microsoft", "Apple", "Amazon", "Facebook");

        List<String> toListOperation= companyNames.stream()
                .filter(str-> str.startsWith("A"))
                .toList();
        toListOperation.forEach(IO::println);

        String[] toArrayConversion = companyNames.stream()
                .toArray(String[]::new);
        IO.println(Arrays.toString(toArrayConversion));

        List<String> toCollectorOperation = companyNames.stream()
                .collect(Collectors
                        .toUnmodifiableList());
        IO.println(toCollectorOperation);

        List<String> reduceOperation = companyNames.stream()
                .reduce((x,y) -> x +" And "+y)
                .stream()
                .toList();
        IO.println(reduceOperation);

        long countOperation = companyNames.stream()
                .filter(str -> str.length() < 4)
                .count();
        IO.println("Total Number Of Companies Less Than Length 4 : "+countOperation);

        Optional<String> maxOperation = companyNames.stream()
                .max(Comparator.comparingInt(String::length));
        IO.println(maxOperation.get());

        Optional<String> minOperation = companyNames.stream()
                .min(Comparator.comparingInt(String::length));
        IO.println(minOperation.get());

        Boolean anyMatchOperation = companyNames.stream()
                .anyMatch(x -> x.startsWith("A"));
        IO.println(anyMatchOperation);

        Boolean allMatchOperation = companyNames.stream()
                .allMatch(str -> str.contains("a"));
        IO.println(allMatchOperation);

        Boolean noneMatchOperation = companyNames.stream()
                .noneMatch(str -> str.length() > 8);

        Optional<String> findFirstOperation = companyNames.stream()
                .findFirst();
        IO.println(findFirstOperation.get());

        Optional<String> findAnyOperation = companyNames.stream()
                .map(String::toLowerCase)
                .findAny();
        IO.println(findAnyOperation.get());

        List<Integer> orderedOperation = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        orderedOperation.parallelStream().forEach(value -> IO.print(value+" "));
        IO.println("Before Using Ordered\n");

        List<Integer> orderedOperation2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        orderedOperation2.parallelStream().forEachOrdered(value -> IO.print(value+" "));
        IO.println("After Using Ordered");



    }
}
