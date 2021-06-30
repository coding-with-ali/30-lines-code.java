    package AlixaProDev.EventListeners;

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

    public class ActionListenerOnButton extends JFrame{
        JButton button;
        ActionListenerOnButton(){
            // create button
            button = new JButton("click Me");
            // add button to the frame
            this.add(button);

            // Registering the button to the ActionListner
            button.addActionListener(new btnHanlder());

            // setting up the frame
            this.setTitle("AlixaProDev");
            this.setSize(new Dimension(300,300));
            this.setLayout(new FlowLayout());
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
        }

        // creating the handler class for the button
        private class btnHanlder implements ActionListener {

            @Override
            public void actionPerformed (ActionEvent e) {
                if (e.getSource()==button){
                    button.setText("Ok Got clicked");
                    button.setBackground(Color.MAGENTA);
                    button.setForeground(Color.BLUE);
                    button.setOpaque(true);
                }
            }
        }

        public static void main (String[] args) {
            new ActionListenerOnButton();
        }
    }
