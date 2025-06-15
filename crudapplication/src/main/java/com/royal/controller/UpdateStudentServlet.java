package com.royal.controller;

import java.io.IOException;

import com.royal.bean.Studentbean;
import com.royal.dao.StudentDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int rno = Integer.parseInt(request.getParameter("rno"));
		String name = request.getParameter("name");
		int std = Integer.parseInt(request.getParameter("std"));
		int marks = Integer.parseInt(request.getParameter("marks"));

		Studentbean sbean = new Studentbean(rno, name, std, marks,null,null,null);
		StudentDao dao = new StudentDao();

		int rowsAffected = dao.updateStudent(sbean, rno);
		RequestDispatcher rd = null;
		if(rowsAffected > 0)
		{
			rd = request.getRequestDispatcher("ListStudentServlet");
		}
		else
		{
			rd = request.getRequestDispatcher("studentregister.html");
		}
		rd.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
