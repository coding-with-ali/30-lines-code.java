package AlixaProDev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEventHandling {
    // first we have to create a JFrame we are creating
    // all these components outside the constructor
    JFrame frame;
    JButton red,blue,green,yellow,whilte,black,cyan;
    // lets create our constructor now.
    ButtonEventHandling(){
        // lets initilaize the references that we have created
        frame = new JFrame("AlixaProDev");
        // creting all buttons
        red = new JButton("red");
        blue = new JButton("blue");
        green = new JButton("green");
        yellow = new JButton("yellow");
        whilte = new JButton("white");
        black = new JButton("black");
        cyan = new JButton("cyan");
        // registering buttons with the event hanler
        BtnHanler hanler = new BtnHanler();
        red.addActionListener(hanler);
        blue.addActionListener(hanler);
        green.addActionListener(hanler);
        yellow.addActionListener(hanler);
        whilte.addActionListener(hanler);
        black.addActionListener(hanler);
        cyan.addActionListener(hanler);

        // customizing the frame and adding the buttons
        frame.add(red);
        frame.add(blue);
        frame.add(green);
        frame.add(yellow);
        frame.add(whilte);
        frame.add(black);
        frame.add(cyan);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }
    // we want to change the color of the Frame with
    // these buttons
    private class BtnHanler implements ActionListener {

        @Override
        public void actionPerformed (ActionEvent e) {
            // the e.getSource() will return an object
            // so we have to cast it to the Button type
            JButton res= (JButton)e.getSource();
            if (red.equals(res))
                frame.getContentPane().setBackground(Color.red);
            else if (green.equals(res))
                frame.getContentPane().setBackground(Color.green);
            else if (yellow.equals(res))
                frame.getContentPane().setBackground(Color.yellow);
            else if (black.equals(res))
                frame.getContentPane().setBackground(Color.black);
            else if (blue.equals(res))
                frame.getContentPane().setBackground(Color.blue);
            else if (cyan.equals(res))
                frame.getContentPane().setBackground(Color.cyan);
            else if (whilte.equals(res))
                frame.getContentPane().setBackground(Color.white);

            }

    }

    public static void main (String[] args) {
        new ButtonEventHandling();
    }

}
