package advancedJava.FileHandling;

import java.io.*;

public class Paperdata {
    public static void main (String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("out.txt");
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            printWriter.write("arsalan");
            printWriter.close();

            FileReader fileReader = new FileReader("out.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
