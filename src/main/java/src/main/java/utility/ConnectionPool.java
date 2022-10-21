package src.main.java.utility;

import java.sql.*;

public class ConnectionPool {
    public static ConnectionPool main(String[] args) {

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Matthew1");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from Attorney");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("first_name"));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}