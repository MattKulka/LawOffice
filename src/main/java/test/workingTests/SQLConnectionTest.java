package test.workingTests;

import java.sql.Connection;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.*;

public class SQLConnectionTest {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet rs;



    @BeforeClass
    public void setUp() {
        String databaseURL = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Matthew1";
        connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Starting Connection to MYSQL Database");
            System.out.println("Connecting to Database...");
            connection = DriverManager.getConnection(databaseURL, user, password);
            if (connection != null) {
                System.out.println("Connected to the Database...");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public static void getAttorneysFromDataBase() {
        try {
            String query = "select * from Attorney";
            statement = connection.createStatement();
            rs = statement.executeQuery(query);

            while(rs.next()){
                int Id= rs.getInt("Id");
                String first_name= rs.getString("first_Name");
                String last_name= rs.getString("last_Name");
                String practice = rs.getString("practice");
                String Office_id = rs.getString("Office_id");
                System.out.println(Id+ " , "+ first_name + " " + last_name + " , " + practice + " , " + Office_id);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public static void getPaymentFromDataBase() {
        try {
            String query = "select * from Payment";
            statement = connection.createStatement();
            rs = statement.executeQuery(query);

            while(rs.next()){
                int Id= rs.getInt("Id");
                String payment_type = rs.getString("payment_type");
                String currency= rs.getString("currency");
                System.out.println(payment_type +  " , " + currency);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    @Test
    public static void getCourthousesFromDataBase() {
        try {
            String query = "select * from Courthouse";
            statement = connection.createStatement();
            rs = statement.executeQuery(query);

            while(rs.next()){
                String name= rs.getString("name");
                System.out.println( name );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        if (connection != null) {
            try {
                System.out.println("Closing Database Connection...");
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}