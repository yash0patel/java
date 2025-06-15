package com.royal.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import com.royal.bean.Studentbean;
import com.royal.util.DBConnection;

public class StudentDao {
	public int insertStudent(Studentbean sbean) {
		String insertQuery = "INSERT INTO students (student_id, first_name, last_name, email, phone, dob, gender, address, course, batch_time, payment_mode, sports, music, debate, volunteering) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		int rowsAffected = 0;

		try (Connection conn = DBConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {

			pstmt.setInt(1, sbean.getStudentId());
			pstmt.setString(2, sbean.getFirstName());
			pstmt.setString(3, sbean.getLastName());
			pstmt.setString(4, sbean.getEmail());
			pstmt.setString(5, sbean.getPhone());
			pstmt.setDate(6, sbean.getDob());
			pstmt.setString(7, sbean.getGender());
			pstmt.setString(8, sbean.getAddress());
			pstmt.setString(9, sbean.getCourse());
			pstmt.setString(10, sbean.getBatchTime());
			pstmt.setString(11, sbean.getPaymentMode());
			pstmt.setBoolean(12, sbean.isSports());
			pstmt.setBoolean(13, sbean.isMusic());
			pstmt.setBoolean(14, sbean.isDebate());
			pstmt.setBoolean(15, sbean.isVolunteering());
//			pstmt.setTimestamp(15, sbean.getRegistrationDate());

			rowsAffected = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rowsAffected;
	}

	public int updateStudent(Studentbean sbean, int id) {
		String updateQuery = "UPDATE students SET " + 
			    "first_name = '" + sbean.getFirstName() + "', " + 
			    "last_name = '" + sbean.getLastName() + "', " + 
			    "email = '" + sbean.getEmail() + "', " + 
			    "phone = '" + sbean.getPhone() + "', " + 
			    "dob = '" + sbean.getDob() + "', " + 
			    "gender = '" + sbean.getGender() + "', " + 
			    "address = '" + sbean.getAddress() + "', " + 
			    "course = '" + sbean.getCourse() + "', " + 
			    "batch_time = '" + sbean.getBatchTime() + "', " + 
			    "payment_mode = '" + sbean.getPaymentMode() + "', " + 
			    "sports = " + (sbean.isSports() ? 1 : 0) + ", " + 
			    "music = " + (sbean.isMusic() ? 1 : 0) + ", " + 
			    "debate = " + (sbean.isDebate() ? 1 : 0) + ", " + 
			    "volunteering = " + (sbean.isVolunteering() ? 1 : 0) + " " + 
			    "WHERE student_id = " + id;
		
		Connection conn = DBConnection.getConnection();

		Statement stmt = null;
		int rowsAffected = 0;
		if (conn != null) {
			try {
				stmt = conn.createStatement();
				rowsAffected = stmt.executeUpdate(updateQuery);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("StudentDao --updateStudent() ---Db not connected");
		}
		return rowsAffected;
	}

	public int deletStudent(int id) {
		String deletQuery = "DELETE FROM students WHERE  student_id = " + id;

		Connection conn = DBConnection.getConnection();

		Statement stmt = null;
		int rowsAffected = 0;
		if (conn != null) {
			try {
				stmt = conn.createStatement();
				rowsAffected = stmt.executeUpdate(deletQuery);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("StudentDao --deletStudent() ---DB not connected");
		}
		return rowsAffected;
	}

	public ArrayList<Studentbean> getAllRecords() {
		String selectQuery = "SELECT * FROM students;";

		Connection conn = DBConnection.getConnection();
		ArrayList<Studentbean> list = new ArrayList<>();
		Studentbean sbean = null;
		Statement stmt = null;
		ResultSet rs = null;

		if (conn != null) {
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(selectQuery);

				while (rs.next()) {
					int student_id = rs.getInt("student_id");
					String first_name = rs.getString("first_name");
					String last_name = rs.getString("last_name");
					String email = rs.getString("email");
					String phone = rs.getString("phone");
					Date dob = rs.getDate("dob");
					String gender = rs.getString("gender");
					String address = rs.getString("address");
					String course = rs.getString("course");
					String batch_time = rs.getString("batch_time");
					String payment_mode = rs.getString("payment_mode");
					boolean sports = rs.getBoolean("sports");
					boolean music = rs.getBoolean("music");
					boolean debate = rs.getBoolean("debate");
					boolean volunteering = rs.getBoolean("volunteering");
					Timestamp registration_date = rs.getTimestamp("registration_date");

					sbean = new Studentbean(student_id, first_name, last_name, email, phone, dob, gender, address,
							course, batch_time, payment_mode, sports, music, debate, volunteering,registration_date);
					list.add(sbean);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("StudentDao -- getAllRecords() --- DB not connected");
		}
		return list;
	}

	public Studentbean getStudentById(int id) {
	    String selectQuery = "SELECT * FROM students WHERE student_id = " + id;

	    Connection conn = DBConnection.getConnection();
	    Studentbean sbean = null;
	    Statement stmt = null;
	    ResultSet rs = null;

	    if (conn != null) {
	        try {
	            stmt = conn.createStatement();
	            rs = stmt.executeQuery(selectQuery);

	            if (rs.next()) { // Check if result exists
	                int student_id = rs.getInt("student_id");
	                String first_name = rs.getString("first_name");
	                String last_name = rs.getString("last_name");
	                String email = rs.getString("email");
	                String phone = rs.getString("phone");
	                Date dob = rs.getDate("dob");
	                String gender = rs.getString("gender");
	                String address = rs.getString("address");
	                String course = rs.getString("course");
	                String batch_time = rs.getString("batch_time");
	                String payment_mode = rs.getString("payment_mode");
	                boolean sports = rs.getBoolean("sports");
	                boolean music = rs.getBoolean("music");
	                boolean debate = rs.getBoolean("debate");
	                boolean volunteering = rs.getBoolean("volunteering");

	                sbean = new Studentbean(student_id, first_name, last_name, email, phone, dob, gender, address, course,
	                        batch_time, payment_mode, sports, music, debate, volunteering);
	            } else {
	                System.out.println("No student found with ID: " + id);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } 
	    } else {
	        System.out.println("StudentDao -- getStudentById() --- DB not connected");
	    }
	    return sbean;
	}
	
	public String getEmailByID(int id) {
		String getEmailQuery = "SELECT email FROM students where student_id = " + id;
		
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String email =  null;
		if (conn != null) {
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(getEmailQuery);
				if (rs.next()) 
				{
					email = rs.getString(1);
	            }
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("StudentDao -- getEmailByID() --- DB not connected");
		}
		return email;
	}
	
	public boolean studentIdExists(int id) {
		String countQuery = "SELECT count(*) FROM students where student_id = " + id;
		
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		int count =  0;
		if (conn != null) {
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(countQuery);
				if (rs.next()) 
				{
	                count = rs.getInt(1);
	            }
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("StudentDao -- studentIdExists() --- DB not connected");
		}
		return count!=0;
	}
	
	public boolean emailExists(String email) {
		String countQuery = "SELECT count(*) FROM students WHERE email = '" + email + "'";
		
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		int count =  0;
		if (conn != null) {
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(countQuery);
				if (rs.next()) 
				{
	                count = rs.getInt(1);
	            }
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("StudentDao -- emailExists() --- DB not connected");
		}
		return count!=0;
	}
}
