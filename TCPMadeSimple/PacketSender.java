package advancedJava.TcpExample;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class PacketSender {

    public static void main(String args[]){
        DatagramSocket socket = null;
        try { int socket_no = 5556;
            socket = new DatagramSocket(socket_no);
            byte[] buffer = new byte[1000];
            while(true) {
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                DatagramPacket reply = new DatagramPacket(request.getData(),
                        request.getLength(),request.getAddress(),
                        request.getPort());
                socket.send(reply); }
        }
        catch (SocketException e) { System.out.println("Socket: " +
                e.getMessage()); }
        catch (IOException e) { System.out.println("IO: " + e.getMessage()); } finally { if (socket != null) socket.close(); }
    }}