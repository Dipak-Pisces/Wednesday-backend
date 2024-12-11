package com.dipaklearn.Wednesday_backend.postgres.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConnection {

    public static void main(String[] args)  throws SQLException {
        
        PostgreConnection postgreConnection = new PostgreConnection();
        Connection connection = postgreConnection.getConnection();

        PreparedStatement pstmt = connection.prepareStatement("INSERT INTO CUSTOMERDETAILS(first_name,last_name,email) VALUES('DIPAK','PATIL','PDIPAK945@GMAIL.COM')");
        int a = pstmt.executeUpdate();
        if(a!=0){System.out.println("updated!!");}
        connection.close(); // throws SQLException
    }
}
