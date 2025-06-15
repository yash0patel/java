package com.royal.controller;

import java.io.IOException;

import com.royal.bean.UserBean;
import com.royal.dao.OTPStoreDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ValidateOTPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
	    String emailid = request.getParameter("emailid");
	    String password = request.getParameter("password");
	    String otp = request.getParameter("otp");
        
	    UserBean userbean = new UserBean(username,emailid,password);
	    request.setAttribute("userBean", userbean); 
	    
	    OTPStoreDao otpDao = new OTPStoreDao();
        boolean isValid = otpDao.verifyOTP(emailid, otp);
        System.out.println("isValid : " + isValid);
        RequestDispatcher rd;
        if (isValid) {
        	if (userbean.getEmailid() != null && !userbean.getEmailid().isEmpty() &&
        		userbean.getPassword() != null && !userbean.getPassword().isEmpty() &&
        		userbean.getUsername() != null && !userbean.getUsername().isEmpty()) 
        	{
        		  
        		rd = request.getRequestDispatcher("InsertUserDataServlet");         		
        	}
        	else
        	{
        		HttpSession session = request.getSession(false);
        		session.setAttribute("emailid", emailid);
        		rd = request.getRequestDispatcher("reset_password.jsp"); 
        	}
        } else {
            request.setAttribute("error", "*Invalid or expired OTP. Please try again.");
            rd = request.getRequestDispatcher("OTPService.jsp"); 
        }

        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



