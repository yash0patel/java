package com.royal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.royal.bean.Studentbean;
import com.royal.util.DBConnection;

public class StudentDaoPrep 
{
	public int insertStudent(Studentbean sbean)
	{
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES(?,?,?)";
		
		System.out.println("insertQuery : " + insertQuery);
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if(conn!=null)
		{
			try {
				pstmt = conn.prepareStatement(insertQuery);
				pstmt.execute("USE JAVA");
				
				pstmt.setString(1, sbean.getName());
				pstmt.setInt(2, sbean.getStd());
				pstmt.setInt(3, sbean.getMarks());
				
				rowsAffected = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("StudentDaoPrep --insertStudent() --Db not connected");
		}
		return rowsAffected;
	}
	
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM student WHERE RNO = ?";
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if(conn!=null)
		{
			try {
				pstmt = conn.prepareStatement(deleteQuery);
				pstmt.execute("USE JAVA");
				pstmt.setInt(1, rno);
				
				rowsAffected = pstmt.executeUpdate();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Db not Connected : "+conn);
		}
		return rowsAffected;
	}
	
	public ArrayList<Studentbean> getAllRecords()
	{
		String selectQuery = "SELECT * FROM student";
		ArrayList<Studentbean> list = new ArrayList<Studentbean>();
		Studentbean sbean = null;
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		if(conn!=null)
		{
			try 
			{
				pstmt = conn.prepareStatement(selectQuery);
				pstmt.execute("USE JAVA");
				rs = pstmt.executeQuery();
			
				while(rs.next())
				{
					int rno = rs.getInt(1);
					String name = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);
					
					sbean = new Studentbean(rno, name, std, marks);
					list.add(sbean);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Db not Connected : "+conn);
		}
		return list;
	}
	public static void main(String[] args) {
		StudentDaoPrep dao = new StudentDaoPrep();
		
		//INSERT Student
		/*
		Scanner sc  = new  Scanner(System.in);
		System.out.print("Enter Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Std : ");
		int std = sc.nextInt();
		System.out.print("Enter Marks : ");
		int marks = sc.nextInt();
		
		Studentbean sbean = new Studentbean(0, name, std, marks);
		
		int rowsAffected = dao.insertStudent(sbean);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Inserted : " + rowsAffected);
			
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
		*/
		
		
		//DELETE Student
		/*
		Scanner sc  = new  Scanner(System.in);
		System.out.print("Enter Rno which you want to delete  : ");
		int rno = sc.nextInt();		
				
		int rowsAffected =dao.deleteStudent(rno);
			
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Deleted : " + rowsAffected);
		} 
		else 
		{
			System.out.println("Student record not Deleted : " + rowsAffected);
		}
		*/
		
		
		//select statment
		ArrayList<Studentbean> list = dao.getAllRecords();
		System.out.println("Total Rows : "+list.size());
		for (int i = 0; i < list.size(); i++) 
		{
			Studentbean s = list.get(i);
			System.out.println(s.getRno() + " " + s.getName() + " " + s.getStd() + " " + s.getMarks());
		}
		
	}
}
