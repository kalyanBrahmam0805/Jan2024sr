package com.jdbc.conn;
import java.sql.*;


public class ConnectionDemo {
	public static void main(String[] args) throws SQLException {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","kalyan2002");
		System.out.println("ConnectionSuccessful"+conn);
	}

}
