package RegularExpressionClientWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2c {
    public static void main (String[] args) {
        System.out.println(isValidOperator("+*"));

    }
    private static boolean isValidOperator(String str){
        Pattern pattern = Pattern.compile("[-\\+\\*%/]");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}

