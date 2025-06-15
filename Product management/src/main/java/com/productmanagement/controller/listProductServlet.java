package com.productmanagement.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.productmanagement.bean.Productbean;
import com.productmanagement.dao.ProductDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class listProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDao dao = new ProductDao();
		
		ArrayList<Productbean> list = dao.getAllRecords();
		
		request.setAttribute("productList", list);
		
		request.getRequestDispatcher("/listProductSection.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
