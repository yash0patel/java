package com.royal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.royal.bean.OTPStoreBean;
import com.royal.util.DBConnection;

public class OTPStoreDao {
	Connection conn = DBConnection.getConnection();
	
    /* Insert a new OTP */
    public boolean insertOTP(OTPStoreBean otpBean) {
        String insertQuery = "INSERT INTO otp_store (email, otp, expires_at) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(insertQuery)) {
            stmt.setString(1, otpBean.getEmail());
            stmt.setString(2, otpBean.getOtp());
            stmt.setTimestamp(3, otpBean.getExpiresAt());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* Verify OTP */
    public boolean verifyOTP(String email, String otp) {
        String verifyQuery = "SELECT * FROM otp_store WHERE email = ? AND otp = ? AND expires_at > UTC_TIMESTAMP()";
        try (PreparedStatement stmt = conn.prepareStatement(verifyQuery)) {
            stmt.setString(1, email);
            stmt.setString(2, otp);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    

    /* Delete expired OTPs */
    public boolean deleteExpiredOTPs() {
        String deletQuery = "DELETE FROM otp_store WHERE expires_at < NOW()";

        try (PreparedStatement stmt = conn.prepareStatement(deletQuery)) {
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
