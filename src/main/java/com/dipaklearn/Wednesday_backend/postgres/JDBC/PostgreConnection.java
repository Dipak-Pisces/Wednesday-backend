package com.dipaklearn.Wednesday_backend.postgres.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreConnection {

    private final String url = "jdbc:postgresql://localhost:5432/bank";
    private final String username = "postgres";
    private final String password  = "";
    public Connection getConnection(){

        try{
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url,username,password);
            return conn;
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
        return null;
    }
}
