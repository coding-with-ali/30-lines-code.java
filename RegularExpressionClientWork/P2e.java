package RegularExpressionClientWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2e {
    public static void main (String[] args) {

        System.out.println(isArithmaticExp("1+2+3+4+5 "));
    }
    private static boolean isArithmaticExp(String  str){

//        Pattern pattern = Pattern.compile("((([-]?[1-9]\\d*|0)|((?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*))[-\\+\\*%/])+(([-]?[1-9]\\d*|0)|((?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*))");

        Pattern pattern = Pattern.compile("([\\s\\r\\t\\n]*(([-]?[1-9]\\d*|0)|((?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*))[\\s\\r\\t\\n]*[-\\+\\*%/])+[\\s\\r\\t\\n]*(([-]?[1-9]\\d*|0)|((?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*))[\\s\\r\\t\\n]*");

        Matcher matcher = pattern.matcher(str);
        boolean f = matcher.matches();
        return f;
    }
}
