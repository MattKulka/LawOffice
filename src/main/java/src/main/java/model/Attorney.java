package src.main.java.model;

import java.sql.*;


public class Attorney {

    public static void main (String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            Connection conn = DriverManager.getConnection(url,"root","Matthew1");
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO Attorney " +
                    "VALUES (1001, 'Saul', 'Goodman', 'Family Law', 'Divorce', 'Albuquerque', '300' )");

            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }

}
