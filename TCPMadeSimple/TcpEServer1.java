package advancedJava.TcpExample;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpEServer1 {
    public static void main (String[] args) throws IOException {
        ServerSocket server=null;
        Socket host=null;
        Scanner scanner = new Scanner(System.in);
        System.out.println(InetAddress.getLocalHost());
        try {
            server = new ServerSocket(5558);
           host = server.accept();

            DataInputStream din = new DataInputStream(host.getInputStream());
            DataOutputStream dout = new DataOutputStream(host.getOutputStream());
            while (true) {
                String cMessage = din.readUTF();
                System.out.println("Client say:" + cMessage);
                System.out.print("Server:");
                dout.writeUTF(scanner.nextLine());
                if (cMessage.equals("exit"))
                    break;

            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            host.close();
            server.close();
        }

    }
}
