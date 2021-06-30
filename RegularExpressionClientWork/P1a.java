package RegularExpressionClientWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1a {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*");
        Matcher matcher = pattern.matcher("_2a3$");
        boolean matchFound = matcher.matches();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
