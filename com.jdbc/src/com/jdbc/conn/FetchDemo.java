package com.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchDemo {
	public static void main(String[] args) throws SQLException{
		String url="jdbc:mysql://localhost/test";
		String user="root";
		String password="kalyan2002";
		String sql="Select*from students";
		Connection conn=DriverManager.getConnection(url, user, password);
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" :" +rs.getString(2));
		}
		
		
	}

}
