package AlixaProDev;

import javax.swing.*;
import java.awt.*;

public class TextFiledBasics extends JFrame {
    // Declare a JTextFiled type reference
    JTextField textField;

    TextFiledBasics(){
        // creating the Object of the JTextField
        textField = new JTextField();
        // setting the bounds of the TextField
        textField.setBounds(0,0,400,30);
        // setting the text of the JtextField
        textField.setText("Write your text here");

        textField.setCaretColor(Color.black);
        textField.setBackground(Color.cyan);
        textField.setForeground(Color.red);
        textField.setFont(new Font("MV Boli",Font.BOLD,24));
        textField.setOpaque(true);


        // do not forgot to add our textfield to the window
        this.add(textField);

        // setting up our JFrame window
        this.setSize(new Dimension(400,200));
        // we will working with the Border Layout this time
        this.setLayout(new BorderLayout());
        this.setIconImage(new ImageIcon("Images/icon.png").getImage());
        this.setTitle("working with JTextField");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main (String[] args) {
        new TextFiledBasics();
    }

}
