package src.main.java.dao.models;

import java.sql.*;

public class Courthouse {

    private String city;
    public Courthouse(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    private static Connection connection;
    private static Statement statement;
    private static ResultSet rs;

    public static void main () {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            Connection conn = DriverManager.getConnection(url,"root","Matthew1");
            Statement st = conn.createStatement();
            st.executeUpdate("DROP TABLE IF EXISTS Courthouse");
            st.executeUpdate("CREATE TABLE Courthouse(\n" +
                    "    id INT AUTO_INCREMENT,\n" +
                    "    name VARCHAR(100),\n" +
                    "    attorney_id INT," +
                    "    PRIMARY KEY (id)" +
                    ");"
            );
            st.executeUpdate("INSERT INTO Courthouse " +
                    "VALUES (1001, ' Albuquerque Courthouse', 1 )");
            st.executeUpdate("INSERT INTO Courthouse " +
                    "VALUES (1002, ' Seattle Courthouse', 2)");
            st.executeUpdate("INSERT INTO Courthouse " +
                    "VALUES (1003, ' Boulder Courthouse', 3 )");

            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

        }

    public static void setUp() {
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

}

