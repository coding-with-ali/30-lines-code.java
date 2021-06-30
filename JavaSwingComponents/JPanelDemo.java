package AlixaProDev;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame{
    JPanelDemo(){
        // Creating Three Labels
        JLabel l1 = new JLabel("ALIXAPRODEV.COM");
        JLabel l2 = new JLabel("Java Graphical User Interface");
        JLabel l3 = new JLabel("Java Projects ");

        // Creating three panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        // setting the size of the panels
        p1.setPreferredSize(new Dimension(400,80));
        p2.setPreferredSize(new Dimension(400,80));
        p3.setPreferredSize(new Dimension(400,80));

        // setting the background of the Panels
        p1.setBackground(Color.yellow);
        p2.setBackground(Color.LIGHT_GRAY);
        p3.setBackground(Color.MAGENTA);

        // adding labels to the panels
        p1.add(l1);
        p2.add(l2);
        p3.add(l3);

        // adding panel to the frame
        this.add(p1,BorderLayout.SOUTH);
        this.add(p2,BorderLayout.NORTH);
        this.add(p3,BorderLayout.CENTER);
        // setting up the Frame
        this.setTitle("AlixaProDev");
        this.setLayout(new BorderLayout());
        this.setSize(new Dimension(400,400));
        this.setVisible(true);
    }

    public static void main (String[] args) {
        new JPanelDemo();
    }
}
