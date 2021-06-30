package AlixaProDev;

import javax.swing.*;
import java.awt.*;
import java.nio.channels.FileLock;


public class FlowLayoutDemo {
    FlowLayoutDemo(){
        // creating bunch of buttons
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button10 = new JButton("10");
        JButton button11 = new JButton("Result");

        // creating the JFrame
        JFrame frame = new JFrame("AlixaProDev.com");
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);
        frame.add(button11);



        // creating our flowLayout
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT );
        // setting up the alighment with the setter method
        flowLayout.setAlignment(FlowLayout.LEFT);
        // setting uf the baseline alignment
        flowLayout.setAlignOnBaseline(false);
        // setting the horizantal gap
        flowLayout.setHgap(4);
        // setting up the vertical gap
        flowLayout.setVgap(5);

        // setting the Frame layout to the FlowLayout
        frame.setLayout(flowLayout);
        frame.setSize(new Dimension(500,500));
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void main (String[] args) {
        new FlowLayoutDemo();
    }
}
