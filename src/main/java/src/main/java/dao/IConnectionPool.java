package src.main.java.dao;

import java.sql.Connection;

public interface IConnectionPool {

    Connection getConnection();

    boolean releaseConnection(Connection connection);

    String getUrl();

    String getUser();

    String getPassword();
}