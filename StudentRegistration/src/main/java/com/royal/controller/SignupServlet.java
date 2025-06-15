package com.royal.controller;

import java.io.IOException;
import java.sql.Timestamp;

import com.royal.bean.OTPStoreBean;
import com.royal.bean.UserBean;
import com.royal.dao.OTPStoreDao;
import com.royal.dao.UserDao;
import com.royal.util.OTPHandler;
import com.royal.util.ValidationUtil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");

		UserBean userbean = new UserBean();
		UserDao dao = new UserDao();
		boolean isValid = true;
		if (ValidationUtil.isValidName(username)) {
			userbean.setUsername(username);
		} else {
			isValid = false;
			request.setAttribute("usernameError", "*Please enter a valid user name.");
		}

		String emailid = request.getParameter("emailid");
		if (ValidationUtil.isValidEmail(emailid)) {
			if (dao.getUserInfoByEmailId(emailid) == null) {
				userbean.setEmailid(emailid);
			} else {
				isValid = false;
				request.setAttribute("emailidError",
						"*The entered email is already logged in. Please enter a unique email.");
			}
		} else {
			isValid = false;
			request.setAttribute("emailidError", "*Please enter a valid email (e.g., example@mail.com).");
		}

		String password = request.getParameter("password");
		if (ValidationUtil.isValidPassword(password)) {
			userbean.setPassword(password);
		} else {
			isValid = false;
			request.setAttribute("passwordError",
					"*Password must be at least 6 characters and contain a special character.");
		}

		RequestDispatcher rd = null;

		if (isValid) {
			Timestamp expiresAt = new Timestamp(System.currentTimeMillis() + 5 * 60 * 1000);

			OTPStoreBean otpbean = new OTPStoreBean(emailid, OTPHandler.sendMail(emailid,username), expiresAt);
			OTPStoreDao otpdao = new OTPStoreDao();
			otpdao.deleteExpiredOTPs();
			otpdao.insertOTP(otpbean);
			
			request.setAttribute("userBean", userbean);
			rd = request.getRequestDispatcher("OTPService.jsp");
		} else {
			request.setAttribute("userbean", userbean);
			rd = request.getRequestDispatcher("Signup.jsp");
		}

		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
