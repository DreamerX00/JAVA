package ImportantConcepts;

/**
 * 📘 <b>Java String Method Reference</b>
 *
 * <p>This guide summarizes commonly used methods from the {@link java.lang.String} class.</p>
 *
 * <p><b>Core Methods:</b></p>
 * <ul>
 *   <li>{@code int length()} — Returns the number of characters in the string.</li>
 *   <li>{@code char charAt(int index)} — Returns the character at the specified index.</li>
 *   <li>{@code String substring(int beginIndex)} — Returns substring from {@code beginIndex} to end.</li>
 *   <li>{@code String substring(int beginIndex, int endIndex)} — Returns substring from {@code beginIndex} to {@code endIndex - 1}.</li>
 *   <li>{@code String concat(String str)} — Appends {@code str} to the end of this string.</li>
 * </ul>
 *
 * <p><b>Search & Indexing:</b></p>
 * <ul>
 *   <li>{@code int indexOf(String s)} — Index of first occurrence of {@code s}, or {@code -1} if not found.</li>
 *   <li>{@code int indexOf(String s, int fromIndex)} — Index of {@code s} starting from {@code fromIndex}.</li>
 *   <li>{@code int lastIndexOf(String s)} — Index of last occurrence of {@code s}, or {@code -1} if not found.</li>
 * </ul>
 *
 * <p><b>Comparison:</b></p>
 * <ul>
 *   <li>{@code boolean equals(Object other)} — Compares this string to another object.</li>
 *   <li>{@code boolean equalsIgnoreCase(String another)} — Compares strings ignoring case.</li>
 *   <li>{@code int compareTo(String another)} — Lexicographically compares two strings.</li>
 *   <li>{@code int compareToIgnoreCase(String another)} — Lexicographically compares strings ignoring case.</li>
 * </ul>
 *
 * <p><b>Case Conversion:</b></p>
 * <ul>
 *   <li>{@code String toLowerCase()} — Converts all characters to lowercase.</li>
 *   <li>{@code String toUpperCase()} — Converts all characters to uppercase.</li>
 * </ul>
 *
 * <p><b>Whitespace & Replacement:</b></p>
 * <ul>
 *   <li>{@code String trim()} — Removes leading and trailing whitespace.</li>
 *   <li>{@code String replace(char oldChar, char newChar)} — Replaces all occurrences of {@code oldChar} with {@code newChar}.</li>
 * </ul>
 *
 * <p><b>Utility Methods:</b></p>
 * <ul>
 *   <li>{@code boolean contains(CharSequence sequence)} — Checks if string contains the given sequence.</li>
 *   <li>{@code char[] toCharArray()} — Converts string to a character array.</li>
 *   <li>{@code boolean startsWith(String prefix)} — Checks if string starts with the given prefix.</li>
 * </ul>
 *
 * <p><b>Example:</b></p>
 * <pre>{@code
 * String s = "Hello World";
 * int len = s.length();               // 11
 * char first = s.charAt(0);           // 'H'
 * String sub = s.substring(6);        // "World"
 * boolean hasWorld = s.contains("World"); // true
 * }</pre>
 */

public class StringOperations {
    private static String str = "  Hello This Is A String : 888839439 Try Experimenting   ";
    static void main() {
        IO.println(
                str.trim()
        );
        IO.println(
                str.replace(" ","")
        );
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        IO.println(
                str.compareTo(abc)
        );


        extraChar("Akash","AkashA");
        IO.println(anagramCheck("Akash","sakAh"));
        IO.println(anagramCheck("Akash","Tanisha"));
    }
    public static char extraChar(String s1, String s2) {
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            int index = s1.indexOf(ch);
            IO.println("Pass : " + i + "\nCharacter : " + ch + "\nIndex of Ch : " + index);
            if (index != -1) {
                String before = s1.substring(0, index);
                String after = s1.substring(index + 1);
                s1 = before + after; // ✅ Fix: update s1
                IO.println(before + " + " + after + " = " + s1);
            } else {
                return ch;
            }
        }
        return ' '; // fallback, should never hit
    }
    public static boolean anagramCheck(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        for (int i = 0; i < s1.length()-1;i++){
            char ch = s1.charAt(i);
            int index = s2.indexOf(ch);
            if (index != -1){
                String before = s1.substring(0,index);
                String after = s1.substring(index+1);
                s1 = before+after;
            }else{
                return false;
            }
        }
        return true;
    }
}
