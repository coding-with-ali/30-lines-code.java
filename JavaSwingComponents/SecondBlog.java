package AlixaProDev;

import javax.swing.*;
import java.awt.*;


/* Joption Dialog is a very important Java Swing GUI Component which is used to provide the User a prebuilt
Dialog boxes to Enter some text or Select from the Options. These are very Important Components In Java.
Today we will be discussing the important properties of the JOptionPane and some Important Features and Types of
the JOptionPane.

There a lot of Customize version of the JOptionPane. we will discuss them in very details.

1. JOptionPane.showOptionDialog();
The Class JOptionPane class have a static method (showOptionDialog()) this method is overloaded and his many forms.
we can pass numbers of parameter to this method. We can specify these parameter using the parameter list of the method.
Lets have a look on the over all set up that we are working on.
we have created a class named JOptionDialogDemo.
we also have a main method in which we are creating the Object of this class in order to
do certain Operation on that Object.

 */
// there are a few steps that we have to go through an order to create a JOptionPane
// 1. Create a constructor of the class
// call the Method of the JOptionPane in many ways
//        JOptionPane.showInputDialog("please Input some text");
//        JOptionPane.showConfirmDialog(null,"Are you Sure");
//        JOptionPane.showOptionDialog(null,"I am in Option Dialog","option dialog",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,2);

public class SecondBlog extends JFrame {
    SecondBlog(){
        int x=JOptionPane.showOptionDialog(null,"are you ok","Answer",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,"yes");
        System.out.println(x);



//    int x= JOptionPane.showOptionDialog(null,"are you ok","Answer",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,"yes");


    }

    public static void main (String[] args) {
        new SecondBlog();
    }

}
