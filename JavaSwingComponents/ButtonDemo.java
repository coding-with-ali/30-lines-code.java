package AlixaProDev;

import javax.swing.*;
import java.awt.*;
import java.io.DataInput;

public class ButtonDemo {
    private final JButton redButton;
    private final JButton greenButton;
    ButtonDemo(){
        redButton = new JButton("RED");
        greenButton = new JButton("GREEN");
        // setting the size of the buttons
        redButton.setSize(new Dimension(100,40));
        greenButton.setSize(new Dimension(100,400));
        // setting the background of buttons
        redButton.setBackground(Color.red);
        greenButton.setBackground(Color.green);
        // creating our fonts to user for the Jbutton
        Font fontForRed= new Font("Dialog",Font.BOLD,30);
        Font fontForGreen = new Font("Mv Boli",Font.BOLD,30);
        // setting the fonts for the button
        redButton.setFont(fontForRed);
        greenButton.setFont(fontForGreen);
        // setting the font color for both buttons
        redButton.setForeground(Color.green);
        greenButton.setForeground(Color.red);

        JFrame frame = new JFrame("AlixaProDev");
        frame.add(redButton);
        frame.add(greenButton);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(new Dimension(250,250));
        frame.setVisible(true);
    }
    public static void main (String[] args) {
        new ButtonDemo();
    }
}
