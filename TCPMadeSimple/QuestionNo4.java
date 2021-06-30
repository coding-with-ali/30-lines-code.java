package advancedJava.TcpExample;

import javax.swing.*;
import java.awt.*;
import java.net.InetAddress;
import java.rmi.UnknownHostException;
import java.util.Random;

public class QuestionNo4 {

        public static void main (String[]args ) throws UnknownHostException, java.net.UnknownHostException {
            Random r = new Random();
            String str = InetAddress.getLocalHost().getHostName();
            JFrame j = new JFrame(str);
            j.setLayout(new GridLayout(3,4));
            for (int i=0; i<str.length();i++) {
                j.add(new JButton(str.charAt(i)+""+r.nextInt(100)));
            }
            j.setBounds(100,100,600, 600);
            j.setVisible(true);
        }

    }