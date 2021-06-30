package RegularExpressionClientWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1d {
    public static void main (String[] args) {
        System.out.println(isValidDeclaration("char , a , b , c"));

    }

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

    private static boolean isValidDataType(String str){
        if (str.equals("int") || str.equals("double")|| str.equals("char")|| str.equals("boolean")){
            return true;
        }
        else return false;
    }
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
    private static boolean isIdentifiner(String string){

        Pattern pattern = Pattern.compile("(?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*");
        Matcher matcher = pattern.matcher(string);
        boolean matchFound = matcher.matches();
        if(matchFound) {
            return true;
        } else {
            return false;
        }
    }
}

