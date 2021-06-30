package RegularExpressionClientWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RoughClass {
    // ____________________Problem 2 ______________________________________________//
    // part 2 e
    private static boolean isArithmaticExp(String  str){
        Pattern pattern = Pattern.compile("([\\s\\r\\t\\n]*(([-]?[1-9]\\d*|0)|((?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*))[\\s\\r\\t\\n]*[-\\+\\*%/])+[\\s\\r\\t\\n]*(([-]?[1-9]\\d*|0)|((?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*))[\\s\\r\\t\\n]*");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }


    // part 2 d
    private static boolean isArgument(String str){
        String Z = "([-]?[1-9]\\d*|0)";
        String l = "(?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*";
        String o = "[\\-\\+\\*\\%\\/]";
        Pattern pattern = Pattern.compile("[([-]?[1-9]\\d*|0)(?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*][\\-\\+\\*\\%\\/](?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    // part 2 c
    private static boolean isValidOperator(String str){
        Pattern pattern = Pattern.compile("[-\\+\\*%/]");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    // part 2 b
    private static boolean isIntegerDecimal (String str){
        Pattern pattern = Pattern.compile("([-]?[1-9]\\d*|0)");
        Matcher matcher = pattern.matcher(str);
        boolean matchFound = matcher.matches();
        if(matchFound) {
            return true;
        } else {
            return false;
        }
    }

    // part 2 a
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

    //____________________________Problem 1__________________________________________//
    // part 1 d
    private static boolean isValidDeclaration(String str){
        boolean valid=true;
        boolean valDatatype=false;
        boolean validExp=false;

        if (str.startsWith(" ")|| str.endsWith(" ")){
            valid =false;
            return valid;
        }
        else {
            String []strList = str.split(" ");
            if (strList.length==1)
                return false;

            valDatatype = isValidDataType(strList[0]);
            if (valDatatype == false)
                return false;
            String exp = "";
            for(int i = 1; i<strList.length;i++){
                exp+=strList[i];
                exp+=" ";
            }
            System.out.println(exp);
            System.out.println(exp);
            if (isValidList(exp.trim())){
                validExp=true;
            }
            valid = validExp&& valDatatype;
        }

        return valid;
    }
    // part 1 c
    private static boolean isValidDataType(String str){
        Pattern pattern = Pattern.compile("(int)|(char)|(double)|(boolean)");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    // part 1 b
    private static boolean isValidList(String str){
        boolean check=true;
        if (str.startsWith(",") || str.startsWith(" ")|| str.endsWith(" ") || str.endsWith(",")){
            check=false;
            return check;
        }
        else {
            String[] elephantList = str.split(",");
            for ( String st : elephantList ) {
                String strr =st.trim();
                check =check && isIdentifiner(strr);
            }
            return check;
        }

    }

    // Part 1 a
    private static boolean isIdentifiner(String string) {

        Pattern pattern = Pattern.compile("(?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*");
        Matcher matcher = pattern.matcher(string);
        boolean matchFound = matcher.matches();
        if (matchFound) {
            return true;
        } else {
            return false;
        }
        //_________________________________________Problem 1 ^ _____________________________________//

    }
}

