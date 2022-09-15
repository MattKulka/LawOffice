package src.main.java.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private static ConnectionPool pool;

    private final List<Connection> connectionPool = new ArrayList<>(5);

    private ConnectionPool() {

    }

    public static ConnectionPool getInstance(){
        if(pool == null){
            pool = new ConnectionPool();
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
