package AlixaProDev;

import javax.swing.*;
import java.awt.*;

public class ThirdBlog  extends JFrame {
    ThirdBlog(){

        JLabel label= new JLabel("goog d");
        label.setBackground(Color.cyan);
        label.setOpaque(true);
        label.setBounds(4,4,300,300);
        this.add(label);
        this.setSize(400,400);
        this.setLayout(null);
        this.setVisible(true);

    }
    public static void main (String[] args) {
        new ThirdBlog();
    }

}
