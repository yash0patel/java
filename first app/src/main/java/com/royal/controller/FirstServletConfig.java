package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServletConfig extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		ServletConfig config = getServletConfig();
		
		String DRIVERCLASS = config.getInitParameter("DRIVERCLASS");
		String URLNAME 		= config.getInitParameter("URLNAME");
		String USERNAME 	= config.getInitParameter("USERNAME");
		String PASSWORD 	= config.getInitParameter("PASSWORD");
		
		
		PrintWriter out = response.getWriter();
		
		out.print("<h3>FirstServletConfig :</h3><br>");
		out.print("<b>DRIVERCLASS</b> : " +DRIVERCLASS+ "</br>");
		out.print("<b>URLNAME</b> : " +URLNAME+ "</br>"); 		
		out.print("<b>USERNAME</b> : " +USERNAME+ "</br>"); 	
		out.print("<b>PASSWORD</b> : " +PASSWORD+ "</br>");
		    
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
