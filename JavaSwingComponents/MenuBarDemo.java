package AlixaProDev;


import javax.swing.*;
import java.awt.*;

public class MenuBarDemo {
    MenuBarDemo(){
        // create a JMenuBar Object
        JMenuBar menuBar = new JMenuBar();

        // creating menus to add it into our menubar
        JMenu util = new JMenu("Util");
        JMenu editor = new JMenu("Editor");
        JMenu help = new JMenu("Hlep");
        JMenu delete = new JMenu("Delete");



        // we have to create our menuItems
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem cut = new JMenuItem("Cut");

        // items for submenu editor
        JMenuItem pDelete = new JMenuItem("pDelete");
        JMenuItem tDelete = new JMenuItem("tDelete ");

        // adding these pdelte and tdelte to the Delete Menu
        delete.add(pDelete);
        delete.add(tDelete);

        // we will add menuItems to the editor menu
        editor.add(copy);
        editor.add(cut);
        // adding menu to another menu
        editor.add(delete);

        // we will add our menu to the menu bar
        menuBar.add(editor);
        menuBar.add(util);
        menuBar.add(help);
        menuBar.setBounds(0,0,300,40);
        menuBar.setBackground(Color.cyan);


        JFrame frame = new JFrame("AlixaProDev");
        frame.add(menuBar,BorderLayout.NORTH);
        frame.setSize(new Dimension(300,300));
        frame.getContentPane().setBackground(Color.blue);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public static void main (String[] args) {
        new MenuBarDemo();
    }
}
