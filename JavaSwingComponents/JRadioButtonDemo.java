package AlixaProDev;

import javax.swing.*;
import java.awt.*;

public class JRadioButtonDemo {
    JFrame frame ;
    JRadioButton radBtn1;
    JRadioButton radBtn2;
    JRadioButton radBtn3;
    JRadioButton radBtn4;
    JLabel label;
    JLabel resultLabel;
    Font myFavFont;
    ButtonGroup btnGroup;

            JRadioButtonDemo(){
        myFavFont = new Font("Helvetica Neue",Font.BOLD,24);
        frame = new JFrame("AlixaProDev");
        radBtn1 = new JRadioButton("Python");
        radBtn2 = new JRadioButton("Java");
        radBtn3 = new JRadioButton("PHP");
        radBtn4 = new JRadioButton("HTML");
        label = new JLabel("Which Language Do you like?");
        resultLabel = new JLabel();


        frame.add(label);
        frame.add(radBtn1);
        frame.add(radBtn2);
        frame.add(radBtn3);
        frame.add(radBtn4);
        frame.add(resultLabel);

        label.setFont(myFavFont);
        radBtn1.setFont(myFavFont);
        radBtn2.setFont(myFavFont);
        radBtn3.setFont(myFavFont);
        radBtn4.setFont(myFavFont);
        resultLabel.setFont(myFavFont);

        btnGroup = new ButtonGroup();
        btnGroup.add(radBtn1);
        btnGroup.add(radBtn2);
        btnGroup.add(radBtn3);
        btnGroup.add(radBtn4);


        label.setBounds(20,20,350,30);
        radBtn1.setBounds(20,50,300,30);
        radBtn2.setBounds(20,80,300,30);
        radBtn3.setBounds(20,110,300,30);
        radBtn4.setBounds(20,140,300,30);
        resultLabel.setBounds(20,170,300,30);

        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void main (String[] args) {
        new JRadioButtonDemo();
    }

}
