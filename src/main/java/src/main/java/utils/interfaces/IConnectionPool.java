package src.main.java.utils.interfaces;

import src.main.java.utils.ConnectionPool;

import java.sql.Connection;

public interface IConnectionPool extends IBaseDAO<ConnectionPool>  {
    Connection getConnection();
    boolean releaseConnection(Connection connection);
    String getUrl();
    String getUser();
    String getPassword();
}