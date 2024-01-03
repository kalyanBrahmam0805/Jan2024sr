
package com.jdbcApp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlApp {
	public static void connectmysql() throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost/test";
		String user="root";
		String pass="kalyan2002";
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println("Connected to Mysql DBMS"+con);
	}


	public static void createTable() throws Exception{
			String url="jdbc:mysql://localhost/test";
			String user="root";
			String pass="kalyan2002";
			String sql="CREATE TABLE trainerss(id INT,name VARCHAR(10))";
			Connection con=DriverManager.getConnection(url, user, pass);
			Statement st=con.createStatement();
			st.executeUpdate(sql);

		}
	
	public static void INSERTrow() throws Exception{
		

			String url="jdbc:mysql://localhost/test";
			String user="root";
			String pass="kalyan2002";
			String sql="INSERT INTO trainerss values (1,'kalyan')";
        	Connection con=DriverManager.getConnection(url, user, pass);
			Statement st=con.createStatement();
			st.executeUpdate(sql);

		}
	}


