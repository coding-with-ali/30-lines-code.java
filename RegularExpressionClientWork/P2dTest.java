package RegularExpressionClientWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2dTest {
    static  String[] data ={
            "a+b",
            "c+1",
            "2+d",
            "3+4",
            "A+B",
            "C+-1",
            "-2+D",
            "-3+-4",
            "a +b",
            "c+ 1",
            " 2+d",
            "3+4 ",
            " A +B",
            " C+ -1",
            " -2+D ",
            "-3 + -4",
            "e1 +F2 ",
            " G3 + h4",
            " __c +$$d ",
            " __c+ $$d ",
            "_$a + -567 ",
            " -23 + -456 ",
            // double the spaces
            "a  +b",
            "c+  1",
            "  2+d",
            "3+4  ",
            " A  +B",
            " C+  -1",
            "  -2+D  ",
            "-3  +  -4",
            "e1  +F2  ",
            "  G3  +  h4",
            "  __c  +$$d  ",
            "  __c+  $$d  ",
            "_$a  +  -567  ",
            "  -23  +  -456  ",
            // do the other operators and work in \t, \r, \n
            "a/b",
            "c/1",
            "2/d",
            "3/4",
            "A/B",
            "C/-1",
            "-2/D",
            "-3/-4",
            "a /b",
            "c/ 1",
            " 2/d",
            "3/4\r ",
            " A\t /B",
            " C/ \n-1",
            "\t -2/D\r ",
            "-3\r\r /\t\t -4",
            "e1\n\n /F2\r\r ",
            " G3 \t/ \rh4",
            " __c \n/$$d ",
            " __c/\n\r\t $$d ",
            "_$a / \r\n\t-567 ",
            " -23\t \r \n /\r \n \t -456 ",
            "a  /b",
            "c/  1",
            "  2/d",
            "3/4  ",
            " A  /B",
            " C/  -1",
            "  -2/D  ",
            "-3  /  -4",
            "e1  /F2  ",
            "  G3  /  h4",
            "  __c  /$$d  ",
            "  __c/  $$d  ",
            "_$a  /  -567  ",
            "  -23  /  -456  ",
            "a*b",
            "c*1",
            "2*d",
            "3*4",
            "A*B",
            "C*-1",
            "-2*D",
            "-3*-4",
            "a *b",
            "c* 1",
            " 2*d",
            "3*4 ",
            " A *B",
            " C* -1",
            " -2*D ",
            "-3 * -4",
            "3*4\r ",
            " A\t *B",
            " C* \n-1",
            "\t -2*D\r ",
            "-3\r\r *\t\t -4",
            "e1\n\n *F2\r\r ",
            " G3 \t* \rh4",
            " __c \n*$$d ",
            " __c*\n\r\t $$d ",
            "_$a * \r\n\t-567 ",
            " -23\t \r \n *\r \n \t -456 ",

            "e1 *F2 ",
            " G3 * h4",
            " __c *$$d ",
            " __c* $$d ",
            "_$a * -567 ",
            " -23 * -456 ",
            "a  *b",
            "c*  1",
            "  2*d",
            "3*4  ",
            " A  *B",
            " C*  -1",
            "  -2*D  ",
            "-3  *  -4",
            "e1  *F2  ",
            "  G3  *  h4",
            "  __c  *$$d  ",
            "  __c*  $$d  ",
            "_$a  *  -567  ",
            "  -23  *  -456  ",

            "a%b",
            "c%1",
            "2%d",
            "3%4",
            "A%B",
            "C%-1",
            "-2%D",
            "-3%-4",
            "a %b",
            "c% 1",
            " 2%d",
            "3%4 ",
            " A %B",
            " C% -1",
            " -2%D ",
            "-3 % -4",
            "e1 %F2 ",
            " G3 % h4",
            " __c %$$d ",
            " __c% $$d ",
            "_$a % -567 ",
            " -23 % -456 ",
            "3%4\r ",
            " A\t %B",
            " C% \n-1",
            "\t -2%D\r ",
            "-3\r\r %\t\t -4",
            "e1\n\n %F2\r\r ",
            " G3 \t% \rh4",
            " __c \n%$$d ",
            " __c%\n\r\t $$d ",
            "_$a % \r\n\t-567 ",
            " -23\t \r \n %\r \n \t -456 ",
            "a  %b",
            "c%  1",
            "  2%d",
            "3%4  ",
            " A  %B",
            " C%  -1",
            "  -2%D  ",
            "-3  %  -4",
            "e1  %F2  ",
            "  G3  %  h4",
            "  __c  %$$d  ",
            "  __c%  $$d  ",
            "_$a  %  -567  ",
            "  -23  %  -456  "
    };
    public static void main (String[] args) {
        for(String  st : data){
            System.out.println(isArgument(st)+":"+ "                   "+":"+st+":");
        }
//        System.out.println(isArgument("q+-2"));
    }
    private static boolean isArgument(String str){
        String Z = "([-]?[1-9]\\d*|0)";
        String l = "((?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*)";
        String o = "[\\-\\+\\*\\%\\/]";


//        String c = String.format("[%s%s]%s[%s%s]",Z,l,o,Z,l);
        // working
//        Pattern pattern = Pattern.compile("\\s*(([-]?[1-9]\\d*|0)|((?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*))\\s*[\\-\\+\\*\\%\\/]\\s*(([-]?[1-9]\\d*|0)|((?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*))\\s*");
        Pattern pattern = Pattern.compile("[\\s\\r\\t\\n]*(([-]?[1-9]\\d*|0)|((?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*))[\\s\\r\\t\\n]*[\\-\\+\\*\\%\\/][\\s\\r\\t\\n]*(([-]?[1-9]\\d*|0)|((?=.*[a-zA-Z])[a-zA-z[_$]&&[^\\s0-9]]+[\\w$_]*))[\\s\\r\\t\\n]*");

        Matcher matcher = pattern.matcher(str);
        boolean f = matcher.matches();

        return f;
    }
}
