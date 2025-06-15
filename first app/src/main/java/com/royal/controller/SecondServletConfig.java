package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServletConfig extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		ServletConfig config = getServletConfig();
		PrintWriter out = response.getWriter();
		
		out.print("<h3>"+config.getServletName()+" : <h3></br>");
		
		Enumeration<String>parameterNames = config.getInitParameterNames();
		
		while(parameterNames.hasMoreElements())
		{
			String parameterName = parameterNames.nextElement();
			String parameterValue = config.getInitParameter(parameterName);
			
			out.print("<b>"+parameterName+"</b> : "+parameterValue+"</br>");
		}   
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
