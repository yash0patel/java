package com.royal.controller;

import java.io.File;
import java.io.IOException;

import com.royal.bean.Studentbean;
import com.royal.dao.StudentDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
@MultipartConfig
(
		fileSizeThreshold = 1024*1024*2,
		maxFileSize = 1024*1024*10,
		maxRequestSize = 1024*1024*50
)
public class InsertStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		String name = request.getParameter("name");
		int std = Integer.parseInt(request.getParameter("std"));
		int Marks = Integer.parseInt(request.getParameter("marks"));
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobbies");

		String hobbiesStr;
		if (hobbies != null && hobbies.length > 0) {
			hobbiesStr = String.join(",", hobbies);
		} else {
			hobbiesStr = "";
		}
		Part resource = request.getPart("resource");
		String fileName = extractFileName(resource);

//		File path = new File("//crudapplication//src//main//webapp//uploads");
//		File path = new File("//crudapplication//src//main//webapp//uploads");
		File path = new File(getServletContext().getRealPath("/") + "uploads");

		if(!path.exists())
		{
			path.mkdir();
		}

		String filePath = path + File.separator + fileName;
		resource.write(filePath);

		Studentbean sbean = new Studentbean(0, name, std, Marks, gender, hobbiesStr, filePath);

		StudentDao dao = new StudentDao();

		int rowsAffected = dao.insertStudent(sbean);
		RequestDispatcher rd = null;
		if (rowsAffected > 0) {
			rd = request.getRequestDispatcher("ListStudentServlet");
			System.out.println("rd :" + rd);
		} else {
			rd = request.getRequestDispatcher("studentregister.html");
			System.out.println("rd :" + rd);
		}
		rd.forward(request, response);

	}

	private String extractFileName(Part part) {
		String contentDisposition = part.getHeader("content-disposition");
	    for (String content : contentDisposition.split(";")) {
	        if (content.trim().startsWith("filename")) {
	            return content.substring(content.indexOf("=") + 1).trim().replace("\"", "");
	        }
	    }
	    return null;
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}