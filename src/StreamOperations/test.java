package StreamOperations;

import java.util.List;
import java.util.stream.Stream;

public class test {
    static void main() {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        Stream<Integer> data = list.stream();


        /*
        System.out.println(data.count());
        data.forEach(n -> System.out.print(n + " ") );
        data.forEach(n -> System.out.print(n + " ") ); // IllegalStateException

        Stream<Integer> newData = data.sorted((x,y) -> y-x);
        newData.forEach(n -> System.out.print(n + " ") );

        Stream<Integer> mapData = data.map(n -> n*2);
        mapData.forEach(n -> System.out.print(n + " ") );
        int result = list.stream()
                .reduce(0, (x,y) -> x+y);

        System.out.println(result);

        */
        list.stream()
                .sorted()
                .filter(x -> x%2==0)
                .map(n -> n*n)
                .map(x -> x > 4 ? x : 0)
                .forEach(System.out::println);

    }
}
