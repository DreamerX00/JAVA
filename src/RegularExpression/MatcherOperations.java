package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherOperations {
    static void main() {
        String lyrics = "Is It Too Much That I Asked For, And I Put My Self In Your Shoes";
        String testInput = "User: [ID:12345] Name: (John Doe) Email: <john.doe@example.com> Phone: {+91-9876543210} Address: \"221B Baker Street, London\" DOB: 1990-05-15 Tags: #developer #java #backend";
        Pattern pattern = Pattern.compile("I.s");
        Matcher matcher = pattern.matcher(lyrics);
        boolean matches = matcher.matches();
        IO.println(matches);

        //Using Find Function
        Pattern pattern1 = Pattern.compile("I");
        Matcher matcher1 = pattern1.matcher(lyrics);
        while (matcher1.find()){
            IO.println("Found From Start On : "+matcher1.start()+"\nAnd End On : "+matcher1.end());
        }

        //using group and Group Count
        Pattern pattern2 = Pattern.compile("\\d+");
        Matcher matcher2 = pattern2.matcher(testInput);
        while (matcher2.find()){
           IO.println("Result Found : " + matcher2.group());
        }
        if (matcher2.find()){
            IO.println("Total No. Of Matches : "+matcher2.groupCount());
        }

    }
}
