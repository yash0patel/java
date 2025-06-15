package com.royal.controller;

import java.io.File;
import java.io.IOException;

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

public class studentregisterservlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String middlename = request.getParameter("middlename");
		String gender = request.getParameter("gender");
		
		System.out.println("firstname : " + firstname);
		System.out.println("lastname : " + lastname);
		System.out.println("middlename : " + middlename);
		System.out.println("gender : " + gender);
		
		Part part = request.getPart("resume");
		String fileName = extractFileName(part);
		
		File path = new File("C:\\Users\\yashp\\eclipse-workspace\\first app\\src\\file123");
		if(!path.exists())
		{
			path.mkdir();
		}
		
		String filePath = path + File.separator + fileName;
		System.out.println("filePath : " + filePath);
		part.write(filePath);
		System.out.println("success");
	}

	public String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		System.out.println("contentDisp : "+contentDisp);
		
		int fileNameIndex = contentDisp.indexOf("filename=");
		int lastfileNameIndex = contentDisp.length()-1;
		
		String filename = contentDisp.substring(fileNameIndex+10,lastfileNameIndex);
		
		System.out.println("filename : " + filename);
		return filename;
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}