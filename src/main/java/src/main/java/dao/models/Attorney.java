package src.main.java.dao.models;

import java.sql.*;


public class Attorney {
    private String name;
    public Attorney(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    private static Connection connection;
    private static Statement statement;
    private static ResultSet rs;

    public static void main () {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            Connection conn = DriverManager.getConnection(url,"root","Matthew1");
            Statement st = conn.createStatement();
            st.executeUpdate("DROP TABLE IF EXISTS Attorney");
            st.executeUpdate("CREATE TABLE Attorney (\n" +
                    "    id INT AUTO_INCREMENT,\n" +
                    "    first_name VARCHAR(255) NOT NULL,\n" +
                    "    last_name VARCHAR(45) NOT NULL,\n" +
                    "    practice VARCHAR(45) NOT NULL,\n" +
                    "    Attorney_type_id VARCHAR(45) NOT NULL,\n" +
                    "    Office_id VARCHAR(45) NOT NULL,\n" +
                    "    Consultation_id INT NOT NULL,\n" +
                    "    PRIMARY KEY (id)\n" +
                    ");"

            );
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

}
