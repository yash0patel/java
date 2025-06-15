package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FourthServletContext extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		ServletContext context = getServletContext();
		PrintWriter out = response.getWriter();
		
		Enumeration<String>parameterNames = context.getInitParameterNames();
		
		while(parameterNames.hasMoreElements())
		{
			String parameterName = parameterNames.nextElement();
			String parameterValue = context.getInitParameter(parameterName);
			
			out.print("<b>"+parameterName+"</b> : "+parameterValue+"</br>");
		}   
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
