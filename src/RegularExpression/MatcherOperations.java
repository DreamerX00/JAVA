package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherOperations {
    static void main() {
        String lyrics = "Is It Too Much That I Asked For, And I Put My Self In Your Shoes";
        Pattern pattern = Pattern.compile("I.s");
        Matcher matcher = pattern.matcher(lyrics);
        boolean matches = matcher.matches();
        IO.println(matches);
    }
}
