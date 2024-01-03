package com.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicInput {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost/students";
		String user="root";
		String pass="kalyan2002";
		String sql="INSERT INTO test VALUES(?,?)";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll Number");
		int roll=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String name=sc.nextLine();
		Connection conn=DriverManager.getConnection(url, user, pass);
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, roll);
		ps.setString(2, name);
		ps.executeUpdate();
		
		
		
	}

}
