package AlixaProDev;

import javax.swing.*;
import java.awt.*;

public class JListDemo extends JFrame {
    JListDemo(){


        DefaultListModel<String> defaultListModel = new DefaultListModel<>();

        JList<String> list = new JList<>(defaultListModel);

        defaultListModel.add(0,"Java");
        defaultListModel.add(1,"Javax");
        defaultListModel.add(2,"Python");
        defaultListModel.add(3,"C++");
        defaultListModel.add(4,"PHP");
        defaultListModel.add(5,"Perl");
        defaultListModel.add(6,"Rouby");
        defaultListModel.add(7,"SQL");
        defaultListModel.add(8,"JS");
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        list.setVisibleRowCount(3);
        list.setFixedCellWidth(50);
        list.setFixedCellHeight(50);
        list.setBackground(Color.red);
        list.setForeground(Color.BLUE);
        list.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        list.setOpaque(true);

        JScrollPane pane = new JScrollPane(list);
        this.add(pane);

        this.getContentPane().setBackground(Color.YELLOW);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(300,300));
        this.setVisible(true);
    }

    public static void main (String[] args) {
        new JListDemo();
    }
}
