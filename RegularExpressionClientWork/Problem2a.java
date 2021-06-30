package RegularExpressionClientWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2a {
    public static void main (String[] args) {


        Pattern pattern = Pattern.compile("^([1-9]\\d*|0)$");

        Matcher matcher = pattern.matcher("345303");


        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }


    }
}
