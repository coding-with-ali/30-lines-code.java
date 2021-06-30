package advancedJava.FileHandling;

import java.util.StringTokenizer;

public class StringTokenIztion {
    public static void main (String[] args) {
        StringTokenizer str = new StringTokenizer("This is a string with 7 words");
        while (str.hasMoreTokens()){
            String t = str.nextToken();
                try {
                    int x= Integer.parseInt(t);
                    System.out.println("find integer :"+x);

                }
                catch (Exception e){
                    System.out.println(t);
                }

        }
    }
}
