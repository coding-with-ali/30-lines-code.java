package RegularExpressionClientWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2a {
    public static void main (String[] args) {
        System.out.println(isDecimalDigit("sdf"));
    }
    private static boolean isDecimalDigit(String str){
        Pattern pattern = Pattern.compile("^([1-9]\\d*|0)$");
        Matcher matcher = pattern.matcher(str);
        boolean matchFound = matcher.matches();
        if(matchFound) {
            return true;
        } else {
            return false;
        }
    }
}
