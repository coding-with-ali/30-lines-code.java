package AlixaProDev;

import javax.swing.*;

// Class Name AdditionOfNo
// you can name it whatever you want
public class AdditionOfNo {
    // lets write our code in the constructor

    AdditionOfNo(){

        // to take the first input from the User
        // we will use the JOptionPane InputDialog

        // This method will take the Input from the User
        // in the form of String so we need to declare a String
        String firstNo;
        // we will assign the value to fristNo;
        firstNo=JOptionPane.showInputDialog("Enter First Number:");

        // we will do the same thing for our second Dialog box
        // 1. Declare a String variable
        String secondNo;
        // 2. Assign the value return from the user to secondNo;
        secondNo = JOptionPane.showInputDialog("Enter Second Number:");

        // Now these values firstNo and secondNo are in the form of String
        // we need to convert it into Double datatype or Integer
        // Double will be best
        // Declare two variable of type Double
        double n1= Double.parseDouble(firstNo);
        double n2 = Double.parseDouble(secondNo);

        // Okay now lets add these two Numbers
        double sum = n1+n2;
        // let us create another JoptionPane to show the Result
        // the JoptionPane Message Dialog will be best for this Purpose
        // we have used the Attribute JOptionPane.PLAIN_MESSAGE
        // we will discuss this attribue at the end of the Article
        // test that shoud be displayed is
        String result = "Sum of Nos is: "+sum;
        JOptionPane.showMessageDialog(null, JOptionPane.ERROR_MESSAGE);

    }
    public static void main (String[] args) {
        new AdditionOfNo();
    }
}