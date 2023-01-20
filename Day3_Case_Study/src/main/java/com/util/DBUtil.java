package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection con;
	
	public static void getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded.");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3307/dac23", "root", "root123");
		System.out.println("Connected to DB.");
	}
	
	public static Connection getCon() {
		return con;
	}

	public static void closeConnection() throws SQLException{
		if(con!=null) {
			con.close();
		}
	}
}
