package com.royal.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.royal.bean.Studentbean;
import com.royal.dao.StudentDao;
import com.royal.util.SessionUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ListStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (SessionUtil.isLoggedIn(session)) {
			StudentDao dao = new StudentDao();

			ArrayList<Studentbean> list = dao.getAllRecords();

			request.setAttribute("list", list);
			request.getRequestDispatcher("viewAllDetails.jsp").forward(request, response);
		} else {
			response.sendRedirect("Login.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}