package com.productmanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	//1) MySql--Credentials
	private static final String URLNAME = "jdbc:mysql://localhost:3306/";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "****";
	private static final String PASSWORD = "*******";
	
	//2) create DbConnection method
	public static Connection getConnection()
	{
		Connection conn = null;
		try {
			//3) load Driver class
			Class.forName(DRIVERCLASS);
			
			//4) pass credentials into DriverManager's getConnection method
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) {
		Connection conn = DBConnection.getConnection();
		
		//5) validate conn object
		if(conn != null)
		{
			System.out.println("Db Connected: " + conn);
		}
		else
		{
			System.out.println("Db not Connected: " + conn);
		}
	}
}
