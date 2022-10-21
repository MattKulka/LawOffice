package src.main.java.utility.interfaces;

import src.main.java.utility.ConnectionPool;

import java.sql.Connection;

public interface IConnectionPool extends IBaseDAO<ConnectionPool>  {
    Connection getConnection();
    void freeConnection(Connection conn);
    boolean initialize(String port, String dbName, String user, String password, int poolSize);
}