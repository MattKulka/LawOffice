package src.main.java.model;

import java.sql.*;


public class Attorney {

    public static void main (String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            Connection conn = DriverManager.getConnection(url,"root","Matthew1");
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO Attorney " +
                    "VALUES (1002, 'Saul', 'Goodman', 'Family Law', 'Divorce', 'Albuquerque', '300' )");
            st.executeUpdate("INSERT INTO Attorney " +
                    "VALUES (1003, 'Walter', 'White', 'Federal Crimes', 'Robbery', 'Albuquerque', '500' )");
            st.executeUpdate("INSERT INTO Attorney " +
                    "VALUES (1004, 'Jesse', 'Pinkman', 'Misdemeanor', 'Drug Crimes', 'Albuquerque', '100' )");

            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }

}
