package AlixaProDev.EventListeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerOnCheckBox extends JFrame {
    JCheckBox checkBox;
    JButton button;
    ActionListenerOnCheckBox(){
        checkBox = new JCheckBox("I agree to the terms.");
        button = new JButton("Proceed");
        button.setEnabled(false);

        // Registering with the Handler
        checkBox.addActionListener(new CheckBoxHanler());
        this.add(checkBox);
        this.add(button);
        this.setTitle("AlixaProDev");
        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(200,200));
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    // inner class for CheckBox Hanler
    private class CheckBoxHanler implements ActionListener{

        @Override
        public void actionPerformed (ActionEvent e) {
            if(e.getSource()==checkBox){
                button.setEnabled(checkBox.isSelected());
            }
        }
    }

    public static void main (String[] args) {
        new ActionListenerOnCheckBox();
    }

}
