package com.royal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.royal.bean.UserBean;
import com.royal.util.DBConnection;

public class UserDao {
	
	public int insertUserData(UserBean userbean) {
		String insertQuery = "INSERT user (username, emailid, password) VALUES (?, ?, ?)";

		int rowsAffected = 0;

		try (Connection conn = DBConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {

			pstmt.setString(1, userbean.getUsername());
			pstmt.setString(2, userbean.getEmailid());
			pstmt.setString(3, userbean.getPassword());

			rowsAffected = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rowsAffected;
	}
	
	public UserBean getUserInfoByEmailId(String email) {
	    String selectQuery = "SELECT * FROM user WHERE emailid = ?";
	    
	    Connection conn = DBConnection.getConnection();
	    UserBean userbean = null;

	    if (conn == null) {
	        System.out.println("UserDao -- getUserInfoByEmailId() --- DB not connected");
	        return null;
	    }

	    try (PreparedStatement stmt = conn.prepareStatement(selectQuery)) {
	        stmt.setString(1, email);
	        try (ResultSet rs = stmt.executeQuery()) {
	            if (rs.next()) {  
	                Integer id = rs.getInt("id");
	                String username = rs.getString("username");
	                String emailid = rs.getString("emailid");
	                String password = rs.getString("password");

	                userbean = new UserBean(id, username, emailid, password);
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	    return userbean;
	}

	public String checkUserValidation(String email, String password) {
	    UserBean userbean = getUserInfoByEmailId(email);
	    System.out.println(userbean);
	    if (userbean != null && userbean.getPassword().equals(password)) {
	        return userbean.getUsername();
	    }
	    
	    return null;
	}

	public boolean updatePasswordByEmail(String email, String newPassword) {
		String updateQuery = "UPDATE user SET password = ? WHERE emailid = ? AND username IS NOT NULL AND username != ''";

	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
	        
	        pstmt.setString(1, newPassword);
	        pstmt.setString(2, email);
	        
	        int rowsUpdated = pstmt.executeUpdate();
	        
	        return rowsUpdated > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	    return false;
	}

}
