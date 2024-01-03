package com.jdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyOracleApp {
	public  static void connectMyoracle() throws SQLException, ClassNotFoundException {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String driver="oracle.jdbc.driver";
		String user="System";
		String pass="kalyan2002";
		Class.forName ("oracle.jdbc.OracleDriver");
		Connection conn=DriverManager.getConnection(url, user, pass);
		System.out.println("Connection to oracle DBMS:"+conn);

		
	}

}
