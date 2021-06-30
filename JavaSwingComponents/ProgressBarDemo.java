package AlixaProDev;

import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {
    JFrame frame = new JFrame();
    JProgressBar progressBar = new JProgressBar();
    ProgressBarDemo () {

        // setting up our progress bar
        progressBar.setValue(0);
        progressBar.setBounds(0, 0, 420, 50);
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("MV Boli", Font.PLAIN, 20));
        progressBar.setForeground(Color.green);
        progressBar.setBackground(Color.BLACK);


        frame.add(progressBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(60,60,420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        try {
            fill();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // method to fill our progress bar
        public void fill() throws InterruptedException {
            int counter =100;
            while (counter>=0){
                progressBar.setValue(counter);
                Thread.sleep(100);
                counter-=1;

            }
            progressBar.setString("AlixaProDev.com");
        }
        public static void main (String[] args) {
            new ProgressBarDemo();
        }
    }
