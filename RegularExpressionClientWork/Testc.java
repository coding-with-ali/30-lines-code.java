package RegularExpressionClientWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testc {
    public static void main (String[] args) {
        String integerPt = "^([-]?[1-9]\\d*|0)$";
        String doublept = "[-]?[0-9]+\\.[0-9]+$";
//        String charPt = "[\\u0000-\\u00FF]";
        String charPt = "^\\p{ASCII}$";
        String StringPt = "^\\p{ASCII}*$";






        Pattern pattern = Pattern.compile(charPt);

        Matcher matcher = pattern.matcher("asd ");


        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
