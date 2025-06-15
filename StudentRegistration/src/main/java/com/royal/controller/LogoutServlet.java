package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				c.setMaxAge(0);
				response.addCookie(c);
			}
		}

		HttpSession session = request.getSession(false);
		if (session != null) {
			request.setAttribute("userName", session.getAttribute("userName"));
		} else {
			request.setAttribute("userName", "Guest");
		}

		RequestDispatcher rd = null;
		if (session != null) {
			session.invalidate();
			rd = request.getRequestDispatcher("Logout.jsp");
		} else {
			rd = request.getRequestDispatcher("Login.jsp");
		}
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
