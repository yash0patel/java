package com.royal.controller;

import java.io.IOException;

import com.royal.bean.UserBean;
import com.royal.dao.UserDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class InsertUserDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserBean userBean = (UserBean) request.getAttribute("userBean");
		
		UserDao dao = new UserDao();
		int rowsAffected = dao.insertUserData(userBean);

		RequestDispatcher rd = null;
		if (rowsAffected > 0) {
			request.setAttribute("emailid", userBean.getEmailid());
			HttpSession session = request.getSession(true);
			rd = request.getRequestDispatcher("Login.jsp");
		} else {
			rd = request.getRequestDispatcher("Signup.jsp");
		}

		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
