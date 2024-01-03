package com.jdbc.conn;

import java.sql.*;

public class InsertDemo {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost/test";
		String user="root"; 
		String pass="kalyan2002";
		String sql="INSERT INTO students VALUES(999,'kalyan')";
		Connection conn=DriverManager.getConnection(url, user, pass);
		Statement st=conn.createStatement();
		int row=st.executeUpdate(sql);
		System.out.println("Rows Udpate " + row);
		
	}

}
