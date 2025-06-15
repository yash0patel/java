package com.royal.controller;

import java.io.IOException;
import java.sql.Timestamp;

import com.royal.bean.OTPStoreBean;
import com.royal.dao.OTPStoreDao;
import com.royal.dao.UserDao;
import com.royal.util.OTPHandler;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ForgotPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailid = request.getParameter("emailid");
		UserDao dao = new UserDao();
		RequestDispatcher rd = null;
        if (emailid != null && !emailid.isEmpty()) 
        {
        	if(dao.getUserInfoByEmailId(emailid) == null)
        	{
        		request.setAttribute("forgetpassworderror","<font color='red' style=\"font-size: small;\">*email is not registered: " + emailid + "</font>");
        		request.setAttribute("emailid",emailid);
        		rd = request.getRequestDispatcher("Login.jsp");
        	}
        	else
        	{
        		Timestamp expiresAt = new Timestamp(System.currentTimeMillis() + 5 * 60 * 1000);

    			OTPStoreBean otpbean = new OTPStoreBean(emailid, OTPHandler.sendMail(emailid,dao.getUserInfoByEmailId(emailid).getUsername()), expiresAt);
    			OTPStoreDao otpdao = new OTPStoreDao();
    			otpdao.deleteExpiredOTPs();
    			otpdao.insertOTP(otpbean);
    			
    			request.setAttribute("emailid", emailid);
    			rd = request.getRequestDispatcher("OTPService.jsp");
        	}
        } else {
            request.setAttribute("forgetpassworderror", "<font color='red' style=\"font-size: small;\">*Please enter a valid email." + emailid + "</font>");
            rd = request.getRequestDispatcher("Login.jsp");
        }
        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
