package RegularExpression;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <h2>Regex Reference for Java Pattern Matching</h2>
 *
 * <p>This guide summarizes commonly used regular expression components in Java,
 * including predefined character classes, custom sets, metacharacters, and quantifiers.</p>
 *
 * <h3>Predefined Character Classes</h3>
 * <table border="1">
 *   <tr><th>Pattern</th><th>Matches</th><th>Example</th></tr>
 *   <tr><td>\d</td><td>Any digit (0-9)</td><td>\d+ matches "123"</td></tr>
 *   <tr><td>\D</td><td>Any non-digit</td><td>\D+ matches "abc"</td></tr>
 *   <tr><td>\w</td><td>Word character (a-z, A-Z, 0-9, _)</td><td>\w+ matches "user_123"</td></tr>
 *   <tr><td>\W</td><td>Non-word character</td><td>\W matches "@" or "!"</td></tr>
 *   <tr><td>\s</td><td>Whitespace (space, tab, newline)</td><td>\s+ matches " "</td></tr>
 *   <tr><td>\S</td><td>Non-whitespace</td><td>\S+ matches "Hello"</td></tr>
 * </table>
 *
 * <h3>Custom Character Sets</h3>
 * <ul>
 *   <li><code>[aeiou]</code> – Matches any vowel</li>
 *   <li><code>[0-9]</code> – Matches any digit (same as <code>\d</code>)</li>
 *   <li><code>[a-zA-Z]</code> – Matches any letter</li>
 *   <li><code>[^0-9]</code> – Matches anything <b>except</b> digits</li>
 * </ul>
 *
 * <h3>Metacharacters</h3>
 * <ul>
 *   <li><code>.</code> – Any character</li>
 *   <li><code>^</code> – Start of line</li>
 *   <li><code>$</code> – End of line</li>
 *   <li><code>|</code> – Alternation (OR)</li>
 * </ul>
 *
 * <h3>Quantifiers</h3>
 * <ul>
 *   <li><code>a*</code> – 0 or more 'a'</li>
 *   <li><code>a+</code> – 1 or more 'a'</li>
 *   <li><code>a?</code> – 0 or 1 'a'</li>
 *   <li><code>a{3}</code> – Exactly 3 'a'</li>
 *   <li><code>a{2,5}</code> – Between 2 and 5 'a'</li>
 *   <li><code>a{3,}</code> – 3 or more 'a'</li>
 * </ul>
 *
 * <h3>Example</h3>
 * <pre>{@code
 * Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
 * Matcher matcher = pattern.matcher("user@domain.com");
 * boolean matches = matcher.matches(); // true
 * }</pre>
 *
 * <p>Use this reference to build robust and readable regex patterns for validation,
 * parsing, and text processing in Java backend applications.</p>
 */

public class CharaterAndMetacharacterOperations {
    static void main() {
        String mail = "HelloBro123@hotmail.in";
        String msg = "We Are Happy To Inform You That You Are Verified On Account no. BX4588";
        String id = "ID : 8878481654";

        findPatter("\\d+",mail);
        findPatter("\\D+",mail);

        findPatter("\\w+",mail);
        findPatter("\\W+",mail);

        findPatter("\\s+",msg);
        findPatter("\\S+",msg);

        findPatter("[aeiou]",msg);
        findPatter("[0-9]",id);
        findPatter("[a-zA-Z]",msg);
        findPatter("[^0-9]",id);

        findPatter("a*",mail);
        findPatter("a+",msg);
        findPatter("I*",id);
        findPatter("a{3}",msg);
        findPatter("a{3,5}",msg);

        //Example
        findPatter("\\w+@\\w+\\.\\w+",mail);
        findPatter("\\w+\\s+\\w+\\s+\\w{3}",msg);

        lowercaseUsername("akash_singh");
        lowercaseUsername("Akash Singh");

        onlyDigits("Akash00398");
        onlyDigits("8513546");

        validPassword("Akash_@455");

        extractChar("Hello! My email is user@test.com and my phone is 555-1234.");

        colorCodeCheck("#FF5733");
    }

    static void lowercaseUsername(String name){
        Pattern pattern = Pattern.compile("^[a-z_]{3,15}$");
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()) IO.println(matcher.group());
    }

    static void onlyDigits(String digit){
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(digit);
        if (matcher.find()) IO.println(matcher.group());
    }

    static void findPatter(String regex, String input){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) IO.println(matcher.group());
    }

    static void validPassword(String pass){
        Pattern pattern = Pattern.compile("\\b\\w{8}\\w{12}\\W_[A-Z]*\\d+");
        Matcher matcher = pattern.matcher(pass);
        if (matcher.find()) IO.println(matcher.group());
        else IO.println("Not Valid ");
    }

    static void extractChar(String data){
        Pattern pattern = Pattern.compile("\\D+");
        Matcher matcher = pattern.matcher(data);
        if (matcher.find()) {
            char[] arr = matcher.group().toCharArray();
            List<char[]> list = List.of(arr);
            list.forEach(x -> IO.println(Arrays.toString(x)));
        }
    }

    static void colorCodeCheck(String code){
        Pattern pattern = Pattern.compile("\\p{XDigit}+");
        Matcher matcher = pattern.matcher(code);
        if (matcher.find()) IO.println(matcher.group());
        else IO.println("Not Valid ");
    }
}
