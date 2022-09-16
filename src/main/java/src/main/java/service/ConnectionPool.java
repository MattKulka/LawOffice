package src.main.java.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private static ConnectionPool pool;

    private static final List<Connection> connectionPool = new ArrayList<>(5);

    private ConnectionPool() {

    }

    public static ConnectionPool getInstance(){
        if(pool == null){
            pool = new ConnectionPool();
            for (int i = 0; i < 5; i++){
                try {
                    connectionPool.add(DriverManager.getConnection("jdbc:mysql://localhost:3306/LawOffice", "root", "Matthew1"));
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return pool;
    }

    public synchronized Connection getConnection(){
        return connectionPool.remove(connectionPool.size()-1);
    }

    public synchronized void returnConnection(Connection connection){
        connectionPool.add(connection);
    }
}
