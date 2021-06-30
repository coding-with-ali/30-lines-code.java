package advancedJava.TcpExample;

import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;
public class Q5 {

        public static void main(String[] args) {
            String ln="this is is good t e r s a";
            System.out.println(ln);
            HashMap<String,Integer> m=new HashMap<String, Integer>();
            StringTokenizer str=new StringTokenizer(ln);
            while(str.hasMoreTokens()){
                String word= str.nextToken();
                if(m.containsKey(word))
                {
                    int count=m.get(word)+1;
                    m.put(word,count);
                }
                else
                {
                    m.put(word ,1 );
                }
            }
            Set<String> keys =m.keySet();
            System.out.println(keys);


        }
    }