package advancedJava.TcpExample;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TcpClient1 {

    public static void main (String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Socket host = null;

        {
            try {
                host = new Socket("127.0.0.1",5558);
                DataOutputStream dout = new DataOutputStream(host.getOutputStream());
                DataInputStream din = new DataInputStream(host.getInputStream());

                while (true) {
                    System.out.print("Client:");
                    dout.writeUTF(scanner.nextLine());
                    String sMessage = din.readUTF();
                    System.out.println("Server Say:" + sMessage);
                    if (sMessage.equals("exit"))
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                host.close();
            }
        }
    }

}
