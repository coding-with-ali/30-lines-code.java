package advancedJava.TcpExample;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client2 {
    public static void main (String[] args) throws IOException {
        Socket client = null;
        try {
            client = new Socket("125.4.5.3",4555);
            DataOutputStream dout = new DataOutputStream(client.getOutputStream());
            dout.writeUTF("i am clint 3");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            client.close();
        }
    }
}
