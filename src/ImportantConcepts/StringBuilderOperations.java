package ImportantConcepts;

/**
 * 📘 <b>Java StringBuilder Method Reference</b>
 *
 * <p>This documentation summarizes key methods from {@link java.lang.StringBuilder}.</p>
 *
 * <p><b>🔧 Modification Methods:</b></p>
 * <ul>
 *   <li>{@code append(String str)} — Appends {@code str} to the end of the sequence.<br>
 *       Example: {@code sb.append("Geeks");}</li>
 *
 *   <li>{@code insert(int offset, String str)} — Inserts {@code str} at the specified {@code offset}.<br>
 *       Example: {@code sb.insert(5, " Geeks");}</li>
 *
 *   <li>{@code replace(int start, int end, String str)} — Replaces characters from {@code start} to {@code end - 1} with {@code str}.<br>
 *       Example: {@code sb.replace(6, 11, "Geeks");}</li>
 *
 *   <li>{@code delete(int start, int end)} — Removes characters from {@code start} to {@code end - 1}.<br>
 *       Example: {@code sb.delete(5, 11);}</li>
 *
 *   <li>{@code deleteCharAt(int index)} — Removes the character at {@code index}.<br>
 *       Example: {@code sb.deleteCharAt(3);}</li>
 *
 *   <li>{@code reverse()} — Reverses the character sequence.<br>
 *       Example: {@code sb.reverse();}</li>
 *
 *   <li>{@code setCharAt(int index, char ch)} — Sets the character at {@code index} to {@code ch}.<br>
 *       Example: {@code sb.setCharAt(0, 'G');}</li>
 * </ul>
 *
 * <p><b>📏 Capacity & Length:</b></p>
 * <ul>
 *   <li>{@code int capacity()} — Returns the current capacity.<br>
 *       Example: {@code int cap = sb.capacity();}</li>
 *
 *   <li>{@code int length()} — Returns the number of characters.<br>
 *       Example: {@code int len = sb.length();}</li>
 *
 *   <li>{@code void ensureCapacity(int minimum)} — Ensures capacity is at least {@code minimum}.<br>
 *       Example: {@code sb.ensureCapacity(50);}</li>
 * </ul>
 *
 * <p><b>🔍 Access & Search:</b></p>
 * <ul>
 *   <li>{@code char charAt(int index)} — Returns the character at {@code index}.<br>
 *       Example: {@code char ch = sb.charAt(4);}</li>
 *
 *   <li>{@code int indexOf(String str)} — Index of first occurrence of {@code str}.<br>
 *       Example: {@code int idx = sb.indexOf("Geeks");}</li>
 *
 *   <li>{@code int lastIndexOf(String str)} — Index of last occurrence of {@code str}.<br>
 *       Example: {@code int idx = sb.lastIndexOf("Geeks");}</li>
 * </ul>
 *
 * <p><b>🔁 Conversion & Substring:</b></p>
 * <ul>
 *   <li>{@code String substring(int start, int end)} — Returns substring from {@code start} to {@code end - 1}.<br>
 *       Example: {@code String sub = sb.substring(0, 5);}</li>
 *
 *   <li>{@code String toString()} — Converts the sequence to a {@code String}.<br>
 *       Example: {@code String result = sb.toString();}</li>
 * </ul>
 *
 * <p><b>💡 Example:</b></p>
 * <pre>{@code
 * StringBuilder sb = new StringBuilder("Hello");
 * sb.append(" World");                      // "Hello World"
 * sb.insert(5, ",");                        // "Hello, World"
 * sb.replace(0, 5, "Hi");                   // "Hi, World"
 * sb.reverse();                             // "dlroW ,iH"
 * int idx = sb.indexOf("World");            // 4
 * String result = sb.toString();            // "dlroW ,iH"
 * }</pre>
 */

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
