package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InputTypeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String text = request.getParameter("text_");
		String number = request.getParameter("number_");
		String email = request.getParameter("email_");
		String password = request.getParameter("password_");
		String color = request.getParameter("color_");
		String date = request.getParameter("date_");
		String range = request.getParameter("range_");
		String checkbox[] = request.getParameterValues("checkbox_");
		String radio = request.getParameter("radio_");
		
		PrintWriter out = response.getWriter();
		out.print("text : " + text + "<br>");
		out.print("number : " + number + "<br>");
		out.print("email : " + email + "<br>");
		out.print("password : " + password + "<br>");
		out.print("color : " + color + "<br>");
		out.print("date : " + date + "<br>");
		out.print("range : " + range + "<br>");
		out.print("checkbox : ");
		for (int i = 0; i < checkbox.length; i++) {
			out.print(checkbox[i]+"  ");
		}
		out.print("radio : " + radio);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
