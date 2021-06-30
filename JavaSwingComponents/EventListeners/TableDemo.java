package AlixaProDev.EventListeners;
import javax.swing.*;
import javax.swing.event.CellEditorListener;
import java.awt.*;
import java.util.EventObject;

public class TableDemo {
    Font myFavFont;
    JFrame frame=new JFrame();
    TableDemo(){
        myFavFont = new Font("Mv Boli",Font.ITALIC,34);
        String [] [] rowsData = {{"1","Hazrat ALi"},{"2","ALixaDev"}};
        String [] colName = {"RollNo","Name"};


        JTable table = new JTable(rowsData,colName);
        table.setBounds(50,50,500,300);
        table.setBackground(Color.MAGENTA);
        table.setRowHeight(45);
        table.setFont(myFavFont);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        frame.setTitle("AlixaProDev");
        frame.setSize(500,400);
        frame.setVisible(true);
    }
    // we need to create our cell Own Cell Editor as follows
    private class MyCellEditor implements CellEditor{

        // this method will gives us the value of the SetEditor
        // as we have explained we will implement this in the next stage
        @Override
        public Object getCellEditorValue () {
            return null;
        }

        // to check whether the cell is Editable
        @Override
        public boolean isCellEditable (EventObject anEvent) {
            return false;
        }
        // thie returns a boolean value of the cell is selcted
        @Override
        public boolean shouldSelectCell (EventObject anEvent) {
            return false;
        }

        // This method is called when we want t stop the editing
        @Override
        public boolean stopCellEditing () {
            return false;
        }

        // We want to accept the partial values
        @Override
        public void cancelCellEditing () {

        }

        // add the CellEditorListener
        @Override
        public void addCellEditorListener (CellEditorListener l) {

        }

        // remove the cell editor listener
        @Override
        public void removeCellEditorListener (CellEditorListener l) {

        }
    }
    public static void main(String[] args) {
        new TableDemo();
    }
}  