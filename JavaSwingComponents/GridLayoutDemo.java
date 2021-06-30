package AlixaProDev;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    GridLayoutDemo(){
        // creating our JFrame window
        JFrame frame = new JFrame("AlixaProDev");

        // creating the GridLayout with hgap and vgap, rows and column
        GridLayout gridLayout;
        gridLayout = new GridLayout(3,3,10,10);

        // setting the layout of the frame to the GridLayout
        frame.setLayout(gridLayout);

        Icon icon1 = new ImageIcon("Images/icon.png");
        Icon icon2 = new ImageIcon("Images/javaicon.jpg");
        Icon icon3 = new ImageIcon("Images/rocket.png");


        // creating a few labels to add it to the Frame
        JLabel label1= new JLabel(icon1);
        JLabel label2= new JLabel(icon2);
        JLabel label3= new JLabel(icon3);
        JLabel label4= new JLabel( icon1);
        JLabel label5= new JLabel(icon2);
        JLabel label6= new JLabel(icon3);
        JLabel label7= new JLabel(icon3);
        JLabel label8= new JLabel(icon2);
        JLabel label9= new JLabel(icon1);

        // adding compont to the index 2
        frame.add(label1,2);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(label8);
        frame.add(label9);

        frame.setSize(new Dimension(400,400));
        frame.setVisible(true);

    }

    public static void main (String[] args) {
        new GridLayoutDemo();
    }
}
