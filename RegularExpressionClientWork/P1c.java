package RegularExpressionClientWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1c {
    public static void main (String[] args) {
        System.out.println(isValidDataType("int"));

    }


    private static boolean isValidDataType(String str){
        Pattern pattern = Pattern.compile("(int)|(char)|(double)|(boolean)");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    private static String whichDataType(String st){
        String integerPt = "([-]?[1-9]\\d*|0)";
        String doublePt = "[-]?[0-9]+\\.[0-9]+";
        String charPt = "\\p{ASCII}$";
        String booleanPt= "true|false";


        Pattern charpt = Pattern.compile(charPt);
        Pattern doublept = Pattern.compile(doublePt);
        Pattern integerpt = Pattern.compile(integerPt);
        Pattern booleanpt = Pattern.compile(booleanPt);

        Matcher matcher;

        if (charpt.matcher(st).matches())
            return "char";
        else if (doublept.matcher(st).matches())
            return "double";
        else if (integerpt.matcher(st).matches())
            return "int";
        else if (booleanpt.matcher(st).matches())
            return "boolean";
        else return "invalid value";

    }
}
