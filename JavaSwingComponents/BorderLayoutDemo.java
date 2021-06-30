package AlixaProDev;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderLayoutDemo {
    JFrame frame;
    BorderLayoutDemo(){
        // crating our JFrame
        frame = new JFrame("AlixaProDev");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);

        // setting the layout to the BorderLayout
        frame.setLayout(new BorderLayout(30,30));
        // lets create 5 panels for our program to check it
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        // setting the backGround color of the Panel
        panel1.setBackground(Color.MAGENTA);
        panel2.setBackground(Color.cyan);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.red);
        panel5.setBackground(Color.black);

        // setting the size of the panels
        panel1.setPreferredSize(new Dimension(100,50));
        panel2.setPreferredSize(new Dimension(100,50));
        panel3.setPreferredSize(new Dimension(100,50));
        panel4.setPreferredSize(new Dimension(100,50));
        panel5.setPreferredSize(new Dimension(100,50));

        // creating a label for the center
        JLabel label = new JLabel("AlixaProDev.Com");
        label.setFont(new Font("Mv Boli",Font.BOLD,40));
        label.setForeground(Color.WHITE);

        panel5.add(label);


        // now lets add our panel to the different position of the layout
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main (String[] args) {
        new BorderLayoutDemo();
    }
}
