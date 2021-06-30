package AlixaProDev.EventListeners;

import com.sun.security.auth.module.JndiLoginModule;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AncestorListenerDemo  {
    JLabel label = new JLabel();
    JButton button = new JButton("remmove me");
    JFrame frame = new JFrame("AlixaProDev");
    JPanel panel = new JPanel();
    AncestorListenerDemo(){
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                if (e.getSource()==button)
                    frame.remove(panel);
            }
        });


        frame.setLayout(new BorderLayout());
        frame.setSize(new Dimension(400,400));
        frame.add(label,BorderLayout.CENTER);
        frame.add(panel,BorderLayout.NORTH);
        frame.setVisible(true);


        button.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded (AncestorEvent event) {
            }

            @Override
            public void ancestorRemoved (AncestorEvent event) {
                label.setText("button Removed successfully");
            }

            @Override
            public void ancestorMoved (AncestorEvent event) {
            }
        });
    }

    public static void main (String[] args) {
        new AncestorListenerDemo();
    }

}
