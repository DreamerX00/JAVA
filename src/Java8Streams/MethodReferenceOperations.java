package Java8Streams;

import module java.base;
public class MethodReferenceOperations {
    static void main() {
        //Method Reference Example
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        //Using Lambda
        names.forEach(str -> System.out.println(str));
        //Using Method Reference
        names.forEach(System.out::println);

        //Constructor Reference Example
        //Using Lambda
        List<Person> people1 = names.stream()
                .map(name -> new Person(name))
                .toList();
        people1.forEach(str -> System.out.println(str));

        //Using Constructor Reference
        List<Person> people2 = names.stream()
                .map(Person::new)
                .toList();
        people2.forEach(System.out::println);



    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person(String name){
        this.name = name;
        this.age = 0;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}
