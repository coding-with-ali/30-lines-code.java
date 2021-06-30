package AlixaProDev;

// Importing the JFrame and JLabel Component from Swing
// to inherit the Functionality of the JFrame
import javax.swing.*;

// Importing the Dimension and FlowLayout
// from awt package. (Abstract Windows Toolkit)
import java.awt.Dimension;
import java.awt.FlowLayout;

// Extending the JFrame Class with
public class GuiApp extends JFrame {
    GuiApp(){

        // Create the Jlabel Object
        JLabel label = new JLabel();
        // Set the size of the Jlabel
        // by passing the object of the Dimension
        label.setSize(new Dimension(200,200));
        // setting the Text of the Jlabel
        label.setText("Hello World I am A JLabel.");


        // Most important Step to add our Jlabel
        // to The Frame
        this.add(label);

        // Setting the Size of the Jframe
        // we can pass the Dimension Object as well
        this.setSize(420,420);
        // By Defalut the Jframe Uses the Border Layout
        // but we can explicitly set it to the Flowlayout
        this.setLayout(new FlowLayout());
        // when the Jframe close the Program will close
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // to make the Jframe Visible
        this.setVisible(true);
    }

    // main method to make the Object of the Class
    // and run our program
    public static void main (String[] args) {
        new GuiApp();


    }
}
