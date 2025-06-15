package com.royal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.royal.bean.Studentbean;
import com.royal.util.DBConnection;

public class StudentDao1 {
	public int insertStudent(Studentbean sbean)
	{
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES('"+sbean.getName()+"',"+sbean.getStd()+","+sbean.getMarks()+")";
	
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
			System.out.println("StudentDao --insertStudent() ---Db not connected");
		}
		return rowsAffected;
	}
	
	public int updateStudent(Studentbean sbean,int rno) 
	{
		String updateQuery = "UPDATE student SET name = '"+sbean.getName()+"',std = "+sbean.getStd()+",marks = "+sbean.getMarks()+" where rno = "+rno+";";
		
		Connection conn = DBConnection.getConnection();
		
		Statement stmt = null;
		int rowsAffected = 0;
		if(conn != null)
		{
			try 
			{
				stmt = conn.createStatement();
				stmt.execute("USE JAVA");
				rowsAffected = stmt.executeUpdate(updateQuery);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("StudentDao --updateStudent() ---Db not connected");
		}
		return rowsAffected;
	}
	
	public int deletStudent(int rno)
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
			System.out.println("StudentDao --deletStudent() ---DB not connected");
		}
		return rowsAffected;	
	}
	
	public ArrayList<Studentbean> getAllRecords() 
	{
		String selectQuery = "SELECT * FROM student;";
		
		Connection conn = DBConnection.getConnection();
		ArrayList<Studentbean> list = new ArrayList<Studentbean>();
		Studentbean sbean = null;
		Statement stmt = null;
		ResultSet rs = null;
		if(conn != null)
		{
			try 
			{
				stmt = conn.createStatement();
				stmt.execute("USE JAVA");
				rs = stmt.executeQuery(selectQuery);
				
				while(rs.next())
				{
					int rno = rs.getInt(1);
					String name = rs.getString(2); 
					int std = rs.getInt(3);;     
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
			System.out.println("StudentDao --getAllRecords() ---DB not connected");
		}
		return list;	
	}

	public Studentbean getStudentById(int rno)
	{
		String selectQuery = "SELECT * FROM student WHERE rno = "+rno;
		
		Connection conn = DBConnection.getConnection();
		Studentbean sbean = null;
		Statement stmt = null;
		ResultSet rs = null;
		if(conn != null)
		{
			try 
			{
				stmt = conn.createStatement();
				stmt.execute("USE JAVA");
				rs = stmt.executeQuery(selectQuery);
				
				if(rs.next())
				{
					int rno_ = rs.getInt(1);
					String name = rs.getString(2); 
					int std = rs.getInt(3);;     
					int marks = rs.getInt(4);   
					
					sbean = new Studentbean(rno_, name, std, marks);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("StudentDao --getAllRecords() ---DB not connected");
		}
		return sbean;
	}
	
	public ArrayList<Studentbean> getStudentByName(String name) 
	{
		String selectQuery = "SELECT * FROM student WHERE name = '"+name+"'";
		
		Connection conn = DBConnection.getConnection();
		ArrayList<Studentbean> list = new ArrayList<Studentbean>();
		Studentbean sbean = null;
		Statement stmt = null;
		ResultSet rs = null;
		if(conn != null)
		{
			try 
			{
				stmt = conn.createStatement();
				stmt.execute("USE JAVA");
				rs = stmt.executeQuery(selectQuery);
				
				while(rs.next())
				{
					int rno = rs.getInt(1);
					String name_ = rs.getString(2); 
					int std = rs.getInt(3);;     
					int marks = rs.getInt(4);   
					
					sbean = new Studentbean(rno, name_, std, marks);
					list.add(sbean);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("StudentDao --getStudentByName() ---DB not connected");
		}
		return list;	
	}

	
	public static void main(String[] args) {
		StudentDao1 dao = new StudentDao1();		
		
		// insert student
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student name : ");
		String name = sc.nextLine();
		System.out.print("Enter Student std : ");
		int std = sc.nextInt();
		System.out.print("Enter Student marks : ");
		int marks = sc.nextInt();
		
		Studentbean sbean = new Studentbean(0, name, std, marks);
		
		int rowsAffected = dao.insertStudent(sbean);
		
		if(rowsAffected > 0)
		{
			System.out.println("Student record successfully Inserted : " + rowsAffected);
		}
		else
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
		*/
		
		
		//delete student
		/*
		Scanner sc = new Scanner(System.in);                                                               
		System.out.print("Enter Student rno : ");                                                          
		int rno = sc.nextInt();                                                                            
		int rowsAffected = dao.deletStudent(rno);                                                              
		                                                                                                   
		if(rowsAffected > 0)                                                                               
		{                                                                                                  
			System.out.println("StdInsertDao ---Student record successfully Deleted : " + rowsAffected);   
		}                                                                                                  
		else                                                                                               
		{                                                                                                  
			System.out.println("StdInsertDao ---Student record not found : " + rowsAffected);              
		}        
		*/
		
		//update student
		/*
		Scanner sc = new Scanner(System.in);                                                               
		System.out.print("Enter Student rno for update details: ");                                                          
		int rno = sc.nextInt();      
		sc.nextLine();
		System.out.print("Enter Student name : ");
		String name = sc.nextLine();
		System.out.print("Enter Student std : ");
		int std = sc.nextInt();
		System.out.print("Enter Student marks : ");
		int marks = sc.nextInt();
		
		Studentbean sbean = new Studentbean(0, name, std, marks);
		int rowsAffected = dao.updateStudent(sbean,rno);                                                              
		                                                                                                   
		if(rowsAffected > 0)                                                                               
		{                                                                                                  
			System.out.println("StdInsertDao ---Student record successfully Deleted : " + rowsAffected);   
		}                                                                                                  
		else                                                                                               
		{                                                                                                  
			System.out.println("StdInsertDao ---Student record not found : " + rowsAffected);              
		} 
		*/
		
		
		//select statment
		/*
		ArrayList<Studentbean> list = dao.getAllRecords();
		System.out.println("Total Rows : "+list.size());
		for (int i = 0; i < list.size(); i++) 
		{
			Studentbean s = list.get(i);
			System.out.println(s.getRno() + " " + s.getName() + " " + s.getStd() + " " + s.getMarks());
		}
		*/
		
		
		//searchById statment
		/*
		Scanner sc = new Scanner(System.in);                                                               
		System.out.print("Enter Student rno for details: ");                                                          
		int rno = sc.nextInt();  
		
		Studentbean sbean = dao.getStudentById(rno);
		
		if(sbean != null)
		{
			System.out.println(sbean.getRno() + " " + sbean.getName() + " " + sbean.getStd() + " " + sbean.getMarks());			
		}
		else
		{
			System.out.println(rno+"'s student record not found");
		}
		*/
		
		
		
		//searchByName statment
		Scanner sc = new Scanner(System.in);                                                               
		System.out.print("Enter Student name for details: ");                                                          
		String name = sc.nextLine();
		ArrayList<Studentbean> list = dao.getStudentByName(name);
		System.out.println("Total Rows : "+list.size());
		for (int i = 0; i < list.size(); i++) 
		{
			Studentbean s = list.get(i);
			System.out.println(s.getRno() + " " + s.getName() + " " + s.getStd() + " " + s.getMarks());
		}
	}
}
