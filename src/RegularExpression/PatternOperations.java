package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternOperations {
    static void main() {
        String regex = "BCAaBaAAa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("BCAaBaAAa");//exact match -> full string
        boolean matches = matcher.matches();

        IO.println("Result : "+matches);


    }
}
