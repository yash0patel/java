package com.royal.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.royal.bean.Registerbean;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int rno = 1;
	ArrayList<Registerbean> list = new ArrayList<>();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String dob = request.getParameter("dob");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String hobbies[] = request.getParameterValues("hobbies");

		StringBuilder hobbies_ = new StringBuilder();
		for (int j = 0; j < hobbies.length; j++) {
			hobbies_.append(hobbies[j] + ",");
		}
		hobbies_.deleteCharAt(hobbies_.length()-1);
		
		Registerbean rb = new Registerbean(rno++, fname, lname, dob, email, password, gender, hobbies_.toString());
		list.add(rb);
		
		response.setContentType("text/html");
		request.setAttribute("list", list);
		RequestDispatcher rd =  request.getRequestDispatcher("ListRegisterServlet");
		rd.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
