package AlixaProDev;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JCheckBoxDemo {
    // Lets creat the refrences of the components
    // that we will need to use in our proogram
    JFrame frame ;
    JCheckBox checkBox;
    JButton button ;
    JLabel label;
    Font myFavFont;
    // Now create the Constructor of the JCheckBox()
    JCheckBoxDemo(){
        // now lets create the instance of JCheckBox
        // and assign it to the reference checkBox

        checkBox = new JCheckBox("Do you agree to terms?");
        frame = new JFrame("AlixaProDev");
        label = new JLabel();
        button = new JButton("Login");
        myFavFont = new Font("Mv Boli",Font.BOLD,30);
        label.setText("THese are the Terms and Conditons!");

        label.setBounds(10,20,580,30);
        checkBox.setBounds(10,50,580,30);
        button.setBounds(10,90,580,30);

        label.setFont(myFavFont);
        checkBox.setFont(myFavFont);
        button.setFont(myFavFont);

        label.setForeground(Color.red);
        checkBox.setForeground(Color.BLUE);
        button.setForeground(Color.black);
        button.setBackground(Color.white);

        button.setEnabled(false);
        checkBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged (ChangeEvent e) {
                if (e.getSource()==checkBox){
                    button.setEnabled(checkBox.isSelected());

                }
            }
        });

        frame.add(label);
        frame.add(checkBox);
        frame.add(button);
        frame.setLayout(null);
        frame.setSize(new Dimension(600,300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main (String[] args) {
        new JCheckBoxDemo();
    }
}