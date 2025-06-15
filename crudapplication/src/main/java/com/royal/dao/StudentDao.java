package com.royal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.royal.bean.Studentbean;
import com.royal.util.DBConnection;

public class StudentDao {
	public int insertStudent(Studentbean sbean)
	{
		String insertQuery = "";

		Connection conn = DBConnection.getConnection();

		Statement stmt = null;
		int rowsAffected = 0;
		if(conn != null)
		{
			try
			{
				stmt = conn.createStatement();
//				stmt.execute("USE stucrudeapp");
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
		String updateQuery = "UPDATE student SET name = '"+sbean.getName()+"',std = "+sbean.getStd()+",marks = "+sbean.getMarks()+",gender = "+sbean.getGender()+",hobbies = "+sbean.getHobbies()+",resourcepath = "+sbean.getResourcepath()+" where rno = "+rno+";";

		Connection conn = DBConnection.getConnection();

		Statement stmt = null;
		int rowsAffected = 0;
		if(conn != null)
		{
			try
			{
				stmt = conn.createStatement();
//				stmt.execute("USE stucrudeapp");
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
//				stmt.execute("USE stucrudeapp");
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
//				stmt.execute("USE stucrudeapp");
				rs = stmt.executeQuery(selectQuery);

				while(rs.next())
				{
					int rno = rs.getInt(1);
					String name = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);
					String gender = rs.getString(5);
					String hobbies = rs.getString(6);
					String resourcepath = rs.getString(7);

					sbean = new Studentbean(rno, name, std, marks,gender,hobbies,resourcepath);
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
//				stmt.execute("USE stucrudeapp");
				rs = stmt.executeQuery(selectQuery);

				if(rs.next())
				{
					int rno_ = rs.getInt(1);
					String name = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);
					String gender = rs.getString(5);
					String hobbies = rs.getString(6);
					String resourcepath = rs.getString(7);

					sbean = new Studentbean(rno, name, std, marks,gender,hobbies,resourcepath);

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
//				stmt.execute("USE stucrudeapp");
				rs = stmt.executeQuery(selectQuery);

				while(rs.next())
				{
					int rno = rs.getInt(1);
					String name_ = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);
					String gender = rs.getString(5);
					String hobbies = rs.getString(6);
					String resourcepath = rs.getString(7);

					sbean = new Studentbean(rno, name, std, marks,gender,hobbies,resourcepath);

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
}
