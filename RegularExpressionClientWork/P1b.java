package RegularExpressionClientWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1b {
    public static void main (String[] args) {

        String str = "v ,w ,xy, z";
        System.out.println(isValidList(str));
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

