package src.main.java.dao.models;

import org.testng.annotations.Test;

import java.sql.*;


public class Payment {

    private String payment_type;

    public Payment(String payment_type) {
        this.payment_type = payment_type;
    }

    public String getPayment_type() {
        return payment_type;
    }
    private static Connection connection;
    private static Statement statement;
    private static ResultSet rs;

    public static void main() {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            Connection conn = DriverManager.getConnection(url, "root", "Matthew1");
            Statement st = conn.createStatement();
            st.executeUpdate("DROP TABLE IF EXISTS Payment");
            st.executeUpdate("CREATE TABLE Payment(\n" +
                    "    id INT NOT NULL,\n" +
                    "    payment_type VARCHAR(50) NOT NULL,\n" +
                    "    currency VARCHAR(20) NOT NULL," +
                    "    PRIMARY KEY (id)" +
                    ");"
            );
            st.executeUpdate("INSERT INTO Payment " +
                    "VALUES (1002, 'Cash', 'USD')");
            st.executeUpdate("INSERT INTO Payment " +
                    "VALUES (1003, 'Check', 'USD' )");
            st.executeUpdate("INSERT INTO Payment " +
                    "VALUES (1004, 'Credit or Debit', ' USD' )");

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

}

