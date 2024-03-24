package org.library.factory;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL = "jdbc:mysql://localhost/livraria";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    private static DataSource dataSource;

    static {
        initializeDataSource();
    }

    private static void initializeDataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(URL);
        basicDataSource.setUsername(USER);
        basicDataSource.setPassword(PASSWORD);
        basicDataSource.setInitialSize(5); // Número inicial de conexões no pool
        basicDataSource.setMaxTotal(15); // Número máximo de conexões no pool
        dataSource = basicDataSource;
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
