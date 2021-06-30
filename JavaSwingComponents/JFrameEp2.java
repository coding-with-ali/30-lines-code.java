package AlixaProDev;

import javax.swing.*;
import java.awt.*;

public class JFrameEp2{

    // creating the JLabel private is a good
    // practice.
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    JFrameEp2(){
        // Craeating a Jlabel and Assingning text
        // with the help of the Constructor
        l1 = new JLabel("Label 1");

        // creating the Object of the Jlabel
        l2 = new JLabel();
        // and assigning the Text with the help
        // of the method.
        l2.setText("Label 2");
        l3 = new JLabel();
        l3.setIcon(new ImageIcon("Images/javaicon.jpg"));
        // creating the instance of the JFrame
        JFrame frame = new JFrame();
        // setting up the title of the Jframe
        frame.setTitle("This is the Title");
        // setting up the Icon of the JFrame
        //1.we have to create an icon
        ImageIcon iconJFrame =  new ImageIcon("Images/icon.png");
        // 2. setting up the Icon of the JFrame.
        frame.setIconImage(iconJFrame.getImage());
        // setting up the size of the JFrame
        frame.setSize(new Dimension(500,500));

        // adding all of the three labels into the frame
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);

        // we can set the size of the frame with two methods
        // 1. by directly specifying the width and height
        frame.setSize(330,330);
        // 2. by creating object of the Dimension
        frame.setSize(new Dimension(300,300));
        // this method is use to dispose the frame to vinish the frame
        frame.dispose();
        // we can specify the location
        frame.setLocation(500,500);
        frame.setLocation(new Point(400,400));
        // when we do not want to spccify the layout then we
        // have to specify the bounds for the frame.
        frame.setBounds(500,500,500,400);


        // setting up the layout of the JFrame
        frame.setLayout(new FlowLayout());

        // to make the Jframe window visibe we have to call the mehtod
        frame.setVisible(true);
        // I have discussed this code in the above section
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main (String[] args) {
        new JFrameEp2();
    }
}
