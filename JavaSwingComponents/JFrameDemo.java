package AlixaProDev;

import javax.swing.*;
import java.awt.*;

// I have extended the JFrame class
// this class will act like a JFrame Now
// is it is inheriting all properties of the JFrame
public class JFrameDemo  {
    JFrameDemo(){
        // this time we have to create the objcet of the
        // JFrame class as follows
        JFrame jFrame = new JFrame();

        // to change the layout to the flowlaoyt
        jFrame.setLayout(new FlowLayout());

        // lets create our Label to show it on
        // the JFrame
        JLabel label = new JLabel("Hello World");


        // as our layout is null so we have
        // to specify the x,y and the weight
        // and height of the label
        label.setSize(400,400);
        label.setLocation(0,0);

        ImageIcon imageIcon = new ImageIcon("Images/icon.png");
        label.setIcon(imageIcon);

        // once we have our label we can add it into
        // our frame.
        jFrame.add(label);


        // setting the size of the JFrame
        // the first parmeter is width and
        // the second parameter is height
        // this method can also accept
        // Dimension class Object that
        jFrame.setSize(500,500);

        // By default the Layout of the Jframe is
        // Block Layout. but we will set it into null
        jFrame.setLayout(null);


        // once we have set the size of the Jframe
        // we have to set the visiblity to true
        // in order to make the JFrame visible
        jFrame.setVisible(true);

        // if someone try to close the Jframe window
        // we want our program to close as well
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main (String[] args) {
        new JFrameDemo();
    }


}
