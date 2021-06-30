package AlixaProDev;
import javax.swing.*;
import java.awt.*;

public class ComboBoxDemo {
    JComboBox<String> comboBox;
    ComboBoxDemo(){
        String [] data = {"Open","Close","Save","Exprort","save All"};
        comboBox = new JComboBox<>(data);
        comboBox.insertItemAt("Undo",1);
        comboBox.setSelectedIndex(2);
        comboBox.setBackground(Color.cyan);
        comboBox.setForeground(Color.BLUE);
        comboBox.setOpaque(true);


        // lets add our ComboBox to our JFrame
        // first we will have to create the JFrame
        JFrame frame = new JFrame("AlixaProDev");

        // add the ComboBox to the JFrame
        frame.add(comboBox);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.getContentPane().setBackground(Color.black);
        frame.setSize(new Dimension(300,300));
        frame.setVisible(true);

    }
    public static void main (String[] args) {
        new ComboBoxDemo();
    }
}