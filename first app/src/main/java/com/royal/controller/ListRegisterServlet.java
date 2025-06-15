package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import com.royal.bean.Registerbean;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListRegisterServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Registerbean> list = (ArrayList<Registerbean>)request.getAttribute("list");
		
		PrintWriter out = response.getWriter();
		out.print("<style>table{border-collapse: collapse;width: 100%;table-layout: auto;margin-top: 20px;}th, td {border: 1px solid #ccc;padding: 8px;text-align: left;white-space: nowrap;}</style>");
		out.print("<table style=\"border: 1px solid black\"><tr><th>No.</th><th>first name</th><th>last name</th><th>Date of birth</th><th>email</th><th>gender</th><th>hobbies</th></tr>");

		for (Iterator i = list.iterator(); i.hasNext();) {
			Registerbean r = (Registerbean) i.next();
			out.print("<tr><td>"+(r.getRno())+"</td><td>"+r.getFname()+"</td><td>"+r.getLname()+"</td><td>"+r.getDob()+"</td><td>"+r.getEmail()+"</td><td>"+r.getGender()+"</td><td>"+r.getHobbies()+"</td></tr>");			
		}
		
		out.print("</table>");
		
		String url = request.getRequestURL().toString().replace("RegisterServlet", "RegisterForm.html");
		out.print("<button onclick=\"window.location.href='" + url + "';\">Back to Register Form</button>");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
