package AlixaProDev.EventListeners;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;

public class CaretListenerDemo{
    JFrame frame;
    JTextArea textField;
    JPanel panel;
    Font myFavFont;
    CaretListenerDemo(){
        // setting our Font and creating frame
        myFavFont = new Font("Mv Boli",Font.BOLD,34);
        frame = new JFrame();
        frame.setTitle("AlixaProdDev");


        // setting up and creating the TextArea
        textField = new JTextArea();
        textField.setLayout(new FlowLayout(FlowLayout.LEFT));
        textField.setBackground(Color.MAGENTA);
        textField.setPreferredSize(new Dimension(395,395));
        textField.setFont(myFavFont);
        textField.setForeground(Color.YELLOW);

        // adding caret Listner to our text Area
        textField.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate (CaretEvent e) {
                System.out.println("Got the Event");
            }
        });

        // setting up the panel to add our textArea to the panel
        panel = new JPanel();
        panel.setBounds(30,30,400,400);
        panel.add(textField);
        panel.setBackground(Color.red);

        // setting up the frame
        frame.setSize(new Dimension(500,500));
        frame.add(panel);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


// Created the main class to initiate our program
class Main{
    public static void main (String[] args) {
        new CaretListenerDemo();
    }
}