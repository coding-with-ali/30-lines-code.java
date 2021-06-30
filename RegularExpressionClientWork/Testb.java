package RegularExpressionClientWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testb {
    public static void main (String[] args) {
//        Pattern pattern = Pattern.compile("^([A-Za-z]*|_*|\\$*)(\\w*|\\$*)*((?=.*[a-z])|(?=.*[A-Z]))");
        // (?<!w)a means there should be no w before a
        // ^[^w,] should not start with a w or comma

        /*
         v, w, x, y, z
   v , w , x , y, z
    $a,_b,x1
   v ,w ,xy, z

   but not

   ,x,a,b
   1,2,3
   d,e,f,
   "    a"
   "b    "
   "  a , b"
   "a , b    "
         */
        // Regix that can not contain w




//        String I = "^([A-Za-z]*|_*|\\$*)(\\w*|\\$*)*((?=.*[a-z])|(?=.*[A-Z]))";
//        String I = ;

//        String pt = "([^\\s,])"+I+"(\\s*,\\s*)*"+I+"\\s*,(\\s)*"+"([^\\s,])$";
//        String pt = "(^[^, ])("+I+"[\\s{0,},*])"+"[^, ]$";
//        String pt = I;


//        System.out.println(pt);

        Pattern pattern = Pattern.compile("^([A-Za-z]*_*\\$*[^0-9 ])(\\w|\\$*)*((?=.*[a-z])|(?=.*[A-Z]))");

        Matcher matcher = pattern.matcher("v");
        boolean matchFound = matcher.matches();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

    }
}
