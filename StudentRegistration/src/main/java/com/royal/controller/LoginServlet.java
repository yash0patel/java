package com.royal.controller;

import java.io.IOException;

import com.royal.dao.UserDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		RequestDispatcher rd = null;
		UserDao dao = new UserDao();
		if (emailid != null && password != null) {
			System.out.println(dao.checkUserValidation(emailid, password));
			if (dao.checkUserValidation(emailid, password) != null) {
				HttpSession session = request.getSession(false);
				session.setAttribute("userName", dao.checkUserValidation(emailid, password));
				Cookie cookie = new Cookie("userName", dao.checkUserValidation(emailid, password));
				response.addCookie(cookie);
				
				session.setAttribute("isLoggedIn", true);
				rd = request.getRequestDispatcher("ListStudentServlet");
			} else {
				request.setAttribute("emailid", emailid);
				request.setAttribute("loginError",
						"<font color='red' style=\"font-size: small;\">*Invalid Email or Password</font>");
				rd = request.getRequestDispatcher("Login.jsp");
			}
		} else {
			rd = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("loginError",
					"<font color='red' style=\"font-size: small;\">*Invalid Email and Password</font>");
		}

		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
