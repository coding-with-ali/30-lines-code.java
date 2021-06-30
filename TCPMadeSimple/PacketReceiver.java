package advancedJava.TcpExample;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class PacketReceiver{
    public static void main(String args[]){
        DatagramSocket socket = null;
        while (true) {
            try {
                socket = new DatagramSocket();
                byte[] buffer = new byte[500];
                DatagramPacket data = new DatagramPacket(buffer, buffer.length);
                socket.receive(data);
                System.out.println("Message:" + new String(data.getData()));
            } catch (IOException e) {

            } finally {
                if (socket != null) socket.close();
            }
        }
    }
}

