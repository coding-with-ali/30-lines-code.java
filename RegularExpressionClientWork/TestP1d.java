package RegularExpressionClientWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestP1d {
    public static void main (String[] args) {
        System.out.println(isValidDeclaration("int a"));
    }
    private static boolean isValidDeclaration (String str){
        Pattern pattern = Pattern.compile("((int)|(char)|(double)|(boolean))\\s*((((?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*)\\s*,\\s*)*\\s+((?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*))");
        Matcher matcher = pattern.matcher(str);

        boolean matchFound = matcher.matches();
        if(matchFound) {
            return true;
        } else {
            return false;
        }
    }
}
