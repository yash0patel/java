package com.royal.controller;

import java.io.IOException;

import com.royal.bean.Studentbean;
import com.royal.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EditStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int rno = Integer.parseInt(request.getParameter("rno"));

		StudentDao dao = new StudentDao();
		Studentbean sbean = dao.getStudentById(rno);
		request.setAttribute("sbean", sbean);
		boolean isEditform = true;
		request.setAttribute("isEditform", isEditform);
		request.getRequestDispatcher("addStudentDetails.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
