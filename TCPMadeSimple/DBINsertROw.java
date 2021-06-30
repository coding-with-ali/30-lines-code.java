package advancedJava.TcpExample;

import java.sql.*;

public class DBINsertROw {
    public static void main (String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/javapaper";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conn = DriverManager.getConnection(url, username, password);

            //Create Statement
            Statement st = Conn.createStatement();
            String q1 = "SELECT * from userdata";
            System.out.println("Hello");
            String q2 = "INSERT INTO userdata (roll_no, name, marks) VALUES ('49','Jabir Aziz','80')";

            st.executeUpdate(q2);


            st.close();
            Conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}