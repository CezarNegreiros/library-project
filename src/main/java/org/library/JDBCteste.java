package org.library;

import org.library.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCteste {
    public static void main(String[] args) throws SQLException{

        Connection conn = new ConnectionFactory().getConnection();
        System.out.println("Conexão pronta!");
        conn.close();
    }
}
