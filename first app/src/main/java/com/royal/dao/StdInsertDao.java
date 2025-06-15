package com.royal.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.royal.util.DBConnection;

public class StdInsertDao {
	public int insertStd()
	{
		String insertQuery = "INSERT INTO student(name, std, marks) VALUES('rohan',10,95)";
		
		Connection conn = DBConnection.getConnection();
		
		Statement stmt = null;
		int rowsAffected = 0;
		if(conn != null)
		{
			try 
			{
				stmt = conn.createStatement();
				stmt.execute("USE JAVA");
				rowsAffected = stmt.executeUpdate(insertQuery);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("StdInsertDao ---DB not connected");
		}
		return rowsAffected;
	}
	
	public int deletStd(int rno)
	{
		String deletQuery = "DELETE FROM STUDENT WHERE RNO = " + rno;
		
		Connection conn = DBConnection.getConnection();
		
		Statement stmt = null;
		int rowsAffected = 0;
		if(conn != null)
		{
			try 
			{
				stmt = conn.createStatement();
				stmt.execute("USE JAVA");
				rowsAffected = stmt.executeUpdate(deletQuery);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("StdInsertDao ---DB not connected");
		}
		return rowsAffected;	
	}
	
	public static void main(String[] args) 
	{
		StdInsertDao Dao = new StdInsertDao();
		int rowsAffected = Dao.insertStd();
		
		if(rowsAffected > 0)
		{
			System.out.println("StdInsertDao ---Student record successfully Inserted : " + rowsAffected);
		}
		else
		{
			System.out.println("StdInsertDao ---Student record not Inserted : " + rowsAffected);	
		}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Student rno : ");
//		int rno = sc.nextInt();
//		int rowsAffected = Dao.deletStd(rno);
//		
//		if(rowsAffected > 0)
//		{
//			System.out.println("StdInsertDao ---Student record successfully Deleted : " + rowsAffected);
//		}
//		else
//		{
//			System.out.println("StdInsertDao ---Student record not found : " + rowsAffected);
//		}
	}
}
