package advancedJava.FileHandling;

import java.io.*;
import java.util.StringTokenizer;

public class StudentMarksCalculatro {


    public static void main (String[] args) throws IOException {
        ReadData();

    }
    public static void ReadData() throws IOException {
        FileReader fileReader = new FileReader("marks.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();

        while (line!=null){
            System.out.println(line);
            writeResult(line,calculateResult(line));
            line= bufferedReader.readLine();
        }
    }
    public static int calculateResult(String line) throws FileNotFoundException {
        int total = 0;
        StringTokenizer str = new StringTokenizer(line);
        String t = str.nextToken();
        while (str.hasMoreTokens()){
            t = str.nextToken();
            try {
                int x= Integer.parseInt(t);
                total+=x;
            }
            catch (Exception e){
//                System.out.println("Searching...");
            }

        }
        return total;
    }

    public static void writeResult(String line,int result) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("result.txt",true);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);
        printWriter.write(line+ ": "+result +"\n");
        printWriter.close();

    }
}
