package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 📘 <b>Regex Quantifiers & Metacharacters Reference</b>
 *
 * <p>Quantifiers define how many times a character, group, or pattern must occur in a regular expression.
 * These are used with {@link java.util.regex.Pattern} and {@link java.util.regex.Matcher}.</p>
 *
 * <p><b>🔢 Quantifier Syntax:</b></p>
 * <ul>
 *   <li>{@code X?} — Matches {@code X} zero or one time.<br>
 *       <i>Example:</i> {@code "colou?r"} matches both "color" and "colour".</li>
 *
 *   <li>{@code X+} — Matches {@code X} one or more times.<br>
 *       <i>Example:</i> {@code "a+"} matches "a", "aa", "aaa", etc.</li>
 *
 *   <li>{@code X*} — Matches {@code X} zero or more times.<br>
 *       <i>Example:</i> {@code "go*"} matches "g", "go", "goo", etc.</li>
 *
 *   <li>{@code X{n}} — Matches {@code X} exactly {@code n} times.<br>
 *       <i>Example:</i> {@code "a{3}"} matches "aaa".</li>
 *
 *   <li>{@code X{n,}} — Matches {@code X} at least {@code n} times.<br>
 *       <i>Example:</i> {@code "a{2,}"} matches "aa", "aaa", "aaaa", etc.</li>
 *
 *   <li>{@code X{n,m}} — Matches {@code X} between {@code n} and {@code m} times (inclusive).<br>
 *       <i>Example:</i> {@code "a{2,4}"} matches "aa", "aaa", or "aaaa".</li>
 * </ul>
 *
 * <p><b>💡 Example Usage:</b></p>
 * <pre>{@code
 * Pattern p = Pattern.compile("a{2,4}");
 * Matcher m = p.matcher("aaaaa");
 * while (m.find()) {
 *     System.out.println(m.group()); // Outputs: "aaaa"
 * }
 * }</pre>
 */

public class QuantifiersOperations {
    static String testInput = "User: [ID:12345] Name: (John Doe) Email: <john.doe@example.com> Phone: {+91-9876543210} Address: \"221B Baker Street, London\" DOB: 1990-05-15 Tags: #developer #java #backend";
    static void main() {
        performOperation("X?",testInput,false);
        performOperation("X+",testInput,false);
        performOperation("X*",testInput,false);
        performOperation("a{1,}",testInput,true);
        performOperation("s{1,4}",testInput,true);
    }

    static void performOperation(String regex, String input, boolean loop){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (loop){
            while (matcher.find()){
                IO.println("Result Of Pattern ["+regex+"] : "+matcher.group());
            }
        }else{
            IO.println(matcher.find() ? regex+" Pattern Found ": "Not Found");
        }
    }
}
