package Java8Streams;

import java.util.function.Predicate;

public class PredicateOperations {
    static void main() {
        Predicate<String> isPhoneNumber = phone -> phone.matches("[0-9]{10}");
        Predicate<String> isNumberStartsWith9 = phone -> phone.startsWith("9");
        Predicate<String> isValidPhoneNumber = isPhoneNumber.and(isNumberStartsWith9);

        IO.println(isValidPhoneNumber.test("9876543210")); // true
        IO.println(isValidPhoneNumber.test("8876543210")); // false
        IO.println(isValidPhoneNumber.test("Akash"));  // false
    }
}
