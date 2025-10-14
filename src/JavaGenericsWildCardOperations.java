import java.util.ArrayList;
import java.util.List;

public class JavaGenericsWildCardOperations {

    public static void main(String[] args) {
        // Upper bound: reading from a list of Numbers
        List<Number> numList = List.of(1, 2, 3, 88, 9, 1.2, 22.2);
        double upperSum = upperBoundExample(numList);
        System.out.println("Upper Bound Sum: " + upperSum);

        // Lower bound: writing Integers into a list of Number
        List<Number> lowerList = new ArrayList<>(List.of(1.2, 22.2)); // mutable list
        double lowerSum = lowerBoundExample(lowerList);
        System.out.println("Lower Bound Sum: " + lowerSum);
    }

    // ✅ Upper bound: safe for reading
    static double upperBoundExample(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // ✅ Lower bound: safe for writing Integer, careful reading
    static double lowerBoundExample(List<? super Integer> list) {
        // Add Integer values safely
        list.add(10);
        list.add(20);
        list.add(30);

        double sum = 0;
        for (Object obj : list) {
            if (obj instanceof Number) {
                sum += ((Number) obj).doubleValue();
            }
        }
        return sum;
    }
}