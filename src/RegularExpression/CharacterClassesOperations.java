package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 📘 <b>Regex Character Classes Reference</b>
 *
 * <p>Character classes define sets of characters to match in regular expressions.
 * These are commonly used with {@link java.util.regex.Pattern} and {@link java.util.regex.Matcher}.</p>
 *
 * <p><b>🔤 Basic Classes:</b></p>
 * <ul>
 *   <li>{@code [xyz]} — Matches any one of {@code x}, {@code y}, or {@code z}.</li>
 *   <li>{@code [^xyz]} — Matches any character <b>except</b> {@code x}, {@code y}, or {@code z}.</li>
 *   <li>{@code [a-zA-Z]} — Matches any uppercase or lowercase English letter.</li>
 * </ul>
 *
 * <p><b>🔗 Set Operations:</b></p>
 * <ul>
 *   <li>{@code [a-f[m-t]]} — Union of ranges {@code a–f} and {@code m–t}. Matches any character in either range.</li>
 *   <li>{@code [a-z && [^m-p]]} — Intersection of {@code a–z} excluding {@code m–p}. Matches all lowercase letters except {@code m} to {@code p}.</li>
 * </ul>
 *
 * <p><b>💡 Example Usage:</b></p>
 * <pre>{@code
 * Pattern p = Pattern.compile("[a-z && [^m-p]]");
 * Matcher m = p.matcher("hello");
 * while (m.find()) {
 *     System.out.println(m.group());
 * }
 * }</pre>
 */
public class CharacterClassesOperations {
    static String testInput = "User: [ID:12345] Name: (John Doe) Email: <john.doe@example.com> Phone: {+91-9876543210} Address: \"221B Baker Street, London\" DOB: 1990-05-15 Tags: #developer #java #backend";

    static void main() {
        performOperation("[abc]",testInput,2);
        performOperation("[^abc]",testInput,3);
        performOperation("[a-dA-Z]",testInput,4);
        performOperation("[a-f[A-B]]",testInput,6);
        performOperation("[a-z&&[^f-m]]",testInput,8);

    }


    static void performOperation(String regex, String input, int resultLimit){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        for (int i = 1; i <= resultLimit && matcher.find(); i++){
            IO.println("Result Of Pattern ["+regex+"] : "+matcher.group());
        }
    }
}
