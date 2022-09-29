package src.main.java.interfaces;

import src.main.java.service.ConnectionPool;

import java.sql.Connection;

public interface IConnectionPool extends IBaseDAO<ConnectionPool>  {
    Connection getConnection();
    boolean releaseConnection(Connection connection);
    String getUrl();
    String getUser();
    String getPassword();
}