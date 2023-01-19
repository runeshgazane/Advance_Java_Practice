package com.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection con;
	
	public static void openConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");//reflection
		System.out.println("Driver Loaded....");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3307/runesh", "root", "root123");
		System.out.println("Connected to DB.");
	}
	
	public static Connection getCon() {
		return con;
	}

	public static void closeConnection() throws SQLException {
		con.close();
	}
}
