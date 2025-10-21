package ImportantConcepts;

/**
 * 📘 <b>Java StringBuffer / StringBuilder Method Reference</b>
 *
 * <p>This documentation summarizes key methods from {@link java.lang.StringBuffer} and {@link java.lang.StringBuilder}.</p>
 *
 * <p><b>🔧 Modification Methods:</b></p>
 * <ul>
 *   <li>{@code append(String str)} — Adds text at the end of the sequence.</li>
 *   <li>{@code appendCodePoint(int codePoint)} — Appends a Unicode code point as a string.</li>
 *   <li>{@code insert(int offset, String str)} — Inserts text at the specified index.</li>
 *   <li>{@code delete(int start, int end)} — Deletes characters from {@code start} to {@code end - 1}.</li>
 *   <li>{@code deleteCharAt(int index)} — Deletes the character at the specified index.</li>
 *   <li>{@code replace(int start, int end, String str)} — Replaces characters in range with {@code str}.</li>
 *   <li>{@code setCharAt(int index, char ch)} — Sets the character at {@code index} to {@code ch}.</li>
 *   <li>{@code setLength(int newLength)} — Sets the length of the sequence.</li>
 *   <li>{@code reverse()} — Reverses the character sequence.</li>
 * </ul>
 *
 * <p><b>📏 Capacity & Length:</b></p>
 * <ul>
 *   <li>{@code int length()} — Returns the number of characters.</li>
 *   <li>{@code int capacity()} — Returns the current capacity.</li>
 *   <li>{@code void ensureCapacity(int minimumCapacity)} — Ensures capacity is at least {@code minimumCapacity}.</li>
 *   <li>{@code void trimToSize()} — Minimizes storage used by the sequence.</li>
 * </ul>
 *
 * <p><b>🔍 Character Access & Unicode:</b></p>
 * <ul>
 *   <li>{@code char charAt(int index)} — Returns the character at {@code index}.</li>
 *   <li>{@code int codePointAt(int index)} — Returns Unicode code point at {@code index}.</li>
 *   <li>{@code int codePointBefore(int index)} — Returns Unicode code point before {@code index}.</li>
 *   <li>{@code int codePointCount(int beginIndex, int endIndex)} — Counts code points in range.</li>
 *   <li>{@code int offsetByCodePoints(int index, int codePointOffset)} — Returns index offset by code points.</li>
 * </ul>
 *
 * <p><b>🔁 Streaming & Conversion:</b></p>
 * <ul>
 *   <li>{@code java.util.stream.IntStream chars()} — Returns stream of zero-extended {@code char} values.</li>
 *   <li>{@code java.util.stream.IntStream codePoints()} — Returns stream of Unicode code points.</li>
 *   <li>{@code char[] toCharArray()} — Converts sequence to character array.</li>
 *   <li>{@code void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)} — Copies characters to array.</li>
 *   <li>{@code String toString()} — Converts sequence to {@code String}.</li>
 * </ul>
 *
 * <p><b>🔎 Search & Substrings:</b></p>
 * <ul>
 *   <li>{@code int indexOf(String str)} — Index of first occurrence of {@code str}.</li>
 *   <li>{@code int indexOf(String str, int fromIndex)} — Index of {@code str} starting from {@code fromIndex}.</li>
 *   <li>{@code int lastIndexOf(String str)} — Index of last occurrence of {@code str}.</li>
 *   <li>{@code int lastIndexOf(String str, int fromIndex)} — Last index of {@code str} before {@code fromIndex}.</li>
 *   <li>{@code CharSequence subSequence(int start, int end)} — Returns subsequence from {@code start} to {@code end - 1}.</li>
 *   <li>{@code String substring(int start)} — Returns substring from {@code start} to end.</li>
 *   <li>{@code String substring(int start, int end)} — Returns substring from {@code start} to {@code end - 1}.</li>
 * </ul>
 *
 * <p><b>💡 Example:</b></p>
 * <pre>{@code
 * StringBuilder sb = new StringBuilder("Hello");
 * sb.append(" World");                      // "Hello World"
 * sb.insert(5, ",");                        // "Hello, World"
 * sb.replace(0, 5, "Hi");                   // "Hi, World"
 * sb.reverse();                             // "dlroW ,iH"
 * int cp = sb.codePointAt(0);               // Unicode code point of first char
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
