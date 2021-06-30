package RegularExpressionClientWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2d {
    public static void main (String[] args) {
        System.out.println(isArgument("a+b"));

    }

    private static boolean isArgument(String str){
        String Z = "([-]?[1-9]\\d*|0)";
        String l = "(?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*";
        String o = "[\\-\\+\\*\\%\\/]";


//        String c = String.format("[%s%s]%s[%s%s]",Z,l,o,Z,l);
        Pattern pattern = Pattern.compile("[([-]?[1-9]\\d*|0)(?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*][\\-\\+\\*\\%\\/](?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*");
        Matcher matcher = pattern.matcher(str);
        boolean f = matcher.matches();

        return f;
    }
}
