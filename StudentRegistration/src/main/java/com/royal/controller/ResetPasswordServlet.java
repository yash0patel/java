package com.royal.controller;

import java.io.IOException;

import com.royal.dao.UserDao;
import com.royal.util.ValidationUtil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ResetPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String newPassword = request.getParameter("newPassword");
		String rePassword = request.getParameter("rePassword");

		HttpSession session = request.getSession(false);
		if (session == null) {
		    request.setAttribute("sessionExpire","<font color='red' style=\"font-size: small;\">Session expired. Try again.</font>");
		    request.getRequestDispatcher("Login.jsp").forward(request, response);
		}


		String emailid = (String) session.getAttribute("emailid");

		UserDao dao = new UserDao();
		boolean isValid = true;
		
		if (ValidationUtil.isValidPassword(newPassword)) 
		{
			if(newPassword.equals(rePassword))
			{
				isValid = true;
			}
			else
			{
				isValid = false;
				request.setAttribute("error", "*Passwords do not match");
			}
		} else {
			isValid = false;
			request.setAttribute("passwordError","*Password must be at least 6 characters and contain a special character.");
		}
		
		RequestDispatcher rd = null;

		if (isValid) {	
			if (dao.updatePasswordByEmail(emailid, newPassword)) {
				request.setAttribute("emailid", emailid);
				request.setAttribute("message", "<font color='green' style=\"font-size: small;\">Password updated successfully.</font>");
				rd = request.getRequestDispatcher("Login.jsp");		    	
			}
			else
			{
				request.setAttribute("emailid", emailid);
		        request.setAttribute("message", "<font color='red' style=\"font-size: small;\">Failed to update password. Try again.</font>");
		        rd = request.getRequestDispatcher("Login.jsp");
		    }
			
		} else {
			request.setAttribute("newPassword", newPassword);
			rd = request.getRequestDispatcher("reset_password.jsp");
		}

		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
