package RegularExpressionClientWork;

public class Main {

    public static void main(String[] args) {
        System.out.println(substEscapes(""));
	// write your code here
    }
    private static String substEscapes(String s){

/*

replaces some of the \s whitespace characters with
the escape sequences used for them and adds single quotes
around the string to make white space visible in
the display.

It also replaces null with the empty string, which will
NOT have the single quotes around it.

*/
        if (s == null)
            return "";

        StringBuilder b = new StringBuilder();

        char[] A = s.toCharArray();
        char c;

        int
                i,
                len = A.length;

        b.append('\'');
        for (i = 0; i < len; i++){
            c = A[i];
            if (c == '\t')
                b.append("\\t");
            else  if (c == '\r')
                b.append("\\r");
            else  if (c == '\n')
                b.append("\\n");
            else  if (c == '\f')
                b.append("\\f");
            else  if (c == '\b')
                b.append("\\b");
            else
                b.append(c);
        }
        // add the final \' to mark the end of the string
        b.append('\'');
        return b.toString();
    }
}
