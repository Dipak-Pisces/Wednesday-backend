package com.dipaklearn.Wednesday_backend.postgres.JDBC;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {

    public static void main(String[] args)  throws SQLException {
        
        PostgreConnection postgreConnection = new PostgreConnection();
        Connection connection = postgreConnection.getConnection();

        System.out.println(connection);

        connection.close(); // throws SQLException
    }
}
