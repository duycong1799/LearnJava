package com.a.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcConnection {

	public static Connection getJDBCConnection() {
		final String url="jdbc:mysql://localhost:3306/projetcsmvc?useUnicode=True&characterEncoding=UTF-8";
		final String user = "root";
		final String password = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		Connection connection = getJDBCConnection();
		
		if(connection != null) {
			System.out.println("Thanh Cong");
		}
		else {
			System.out.println("That Bai");
		}
	} 
}
