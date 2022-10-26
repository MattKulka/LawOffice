package src.main.java.dao.models;

import java.sql.*;


public class OfficeLocations {
    public static void main (String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            Connection conn = DriverManager.getConnection(url,"root","Matthew1");
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO Office_locations " +
                    "VALUES (1001, ' Well St', 'Boulder', 'Colorado', 'zip', 'USA', )");
            st.executeUpdate("INSERT INTO Office_locations " +
                    "VALUES (1002, ' Pure St', 'Albuquerque', 'New Mexico', 'zip', 'USA', )");
            st.executeUpdate("INSERT INTO Office_locations " +
                    "VALUES (1003, ' Flannel St', 'Seattle', 'Washington', 'zip', 'USA', )");

            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }

}


