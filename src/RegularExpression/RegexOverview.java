package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexOverview {
    static void main() {
        String text = "My phone number is 123-456-7890";
        Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()){
            IO.println("Found "+ matcher.group());
        }

        validOtp("Your OTP is 839201");
        validOtp("Your Account No. Is 8674954213");
    }
    static void validOtp(String message){
        Pattern pattern = Pattern.compile("\\b\\d{6}\\b");
        Matcher matcher = pattern.matcher(message);
        if (matcher.find()){
            IO.println("OTP FOUND : "+matcher.group());
        }else IO.println("NO Valid OTP Found");
    }
}
