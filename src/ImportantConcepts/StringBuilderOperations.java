package ImportantConcepts;

public class StringBuilderOperations {
    static void main() {
        //This Is Mutable
        StringBuilder stringBuilder = new StringBuilder("Hello From String Builder");
        IO.println(stringBuilder.codePointAt(0)+" "+(char)stringBuilder.codePointAt(0));

        //Method Chaining Can Also Be Done
        IO.println(stringBuilder
                .append(" From String Builder")
                .insert(2,"[Offset Added]")
                .reverse()
        );

        //To String Method
        String newString = stringBuilder.reverse().toString();
        IO.println(newString);

        //This is not Thread Safe
    }
}
