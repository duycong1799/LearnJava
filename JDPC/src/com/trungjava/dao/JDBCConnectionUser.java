package com.trungjava.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectionUser {
	public static void main(String[] args) {
		JDBCConnection jdbcConnection = new JDBCConnection();
		Connection conn = jdbcConnection.getConnection();
		if (conn == null) {
			System.out.println("that bai");
		} else {
			System.out.println("thanh cong");
		}

	}

	public Connection getConnection() {
		try {
			final String username = "root";
			final String password = "";
			final String url = "jdbc:mysql://localhost:3306/user";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password);
			return conn;
		} catch (Exception ex) {
			System.out.println("Loi ket noi");
			System.out.println(ex);
		}
		return null;

	}

}
