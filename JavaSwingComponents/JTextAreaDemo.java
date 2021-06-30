package AlixaProDev;

import javax.swing.*;
import java.awt.*;

public class JTextAreaDemo extends JFrame{
    JTextAreaDemo(){
        // creating our favourite font of type MV Boli.
        Font myfavFont = new Font("Mv Boli",Font.BOLD,53);
        // Creating our text Area
        JTextArea textArea= new JTextArea();
        // creating our scroll pane to add to our textArea
        ScrollPane pane = new ScrollPane();
        // text area added to the pane
        pane.add(textArea);

        pane.setBounds(20,20,300,300);
        // bounds set for the text area
        textArea.setBounds(20,20,350,350);
        textArea.setFont(myfavFont);
        textArea.setBackground(Color.MAGENTA);
        textArea.setForeground(Color.BLUE);
        textArea.setOpaque(true);
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.CYAN);
        frame.add(pane);
        frame.setLayout(null);
        frame.setSize(new Dimension(400,400));
        frame.setVisible(true);
        // getting the selected text from the textArea
        String selectedText = textArea.getSelectedText();

    }

    public static void main (String[] args) {
        new JTextAreaDemo();
    }

}
