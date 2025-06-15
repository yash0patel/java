package com.royal.controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import com.royal.bean.Studentbean;
import com.royal.dao.StudentDao;
import com.royal.util.ValidationUtil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Studentbean sbean = new Studentbean();
		StudentDao dao = new StudentDao();
		boolean isValid = true;
		
		//studentId
		String studentId = request.getParameter("studentId");	
		if(ValidationUtil.isNotEmpty(studentId) && !studentId.equals("0"))
	    {
	    	if(!dao.studentIdExists(Integer.parseInt(studentId)))
	    	{
	    		int id = Integer.parseInt(studentId);
	    		sbean.setStudentId(id);	    		
	    	}
	    	else
	    	{
	    		isValid = false;
	    		request.setAttribute("studentIdError", "The entered Student ID is already used. Please enter a valid Student ID.");
	    	}
	    }
	    else
	    {
	    	isValid = false;
			request.setAttribute("studentIdError", "Student ID cannot be empty");
	    }
		
	    //firstName
		String firstName = request.getParameter("firstName");
		if(ValidationUtil.isValidName(firstName))
		{
			sbean.setFirstName(firstName);
		}
		else
		{
			isValid = false;
			request.setAttribute("firstNameError", "Please enter a valid first name.");
			
		}
		
		//lastName
	    String lastName = request.getParameter("lastName");
	    if(ValidationUtil.isValidName(lastName))
		{
			sbean.setLastName(lastName);
		}
		else
		{
			isValid = false;
			request.setAttribute("lastNameError", "Please enter a valid last name.");
		}
	    
	    //email
	    String email = request.getParameter("email");
	    if(ValidationUtil.isValidEmail(email))
		{
	    	if(!dao.emailExists(email))
	    	{
	    		sbean.setEmail(email);	    		
	    	}
	    	else
	    	{
	    		request.setAttribute("emailError", "The entered email is already used. Please enter a unique email.");
	    	}
		}
		else
		{
			isValid = false;
			request.setAttribute("emailError", "Please enter a valid email (e.g., example@mail.com).");
		}
	    
	    //phone
	    String phone = request.getParameter("phone");
	    if(ValidationUtil.isValidPhone(phone))
		{
			sbean.setPhone(phone);
		}
		else
		{
			isValid = false;
			request.setAttribute("phoneError", "Please enter a valid phone number.");
		}
	    
	    //dob
	    String dob = request.getParameter("dob");
	    if(ValidationUtil.isValidDateOrTime(dob) && ValidationUtil.isNotEmpty(dob))
		{
	    	LocalDate dobLocalDate = LocalDate.parse(dob);
	    	if(LocalDate.parse(dob).compareTo(LocalDate.now()) <= 0)
	    	{
	    		sbean.setDob(Date.valueOf(dobLocalDate));	    		
	    	}
	    	else
	    	{
	    		sbean.setDob(Date.valueOf(dobLocalDate));
	    		request.setAttribute("dobError", "Date of Birth is not valid.");
	    	}
		}
		else
		{
			isValid = false;
			request.setAttribute("dobError", "Please enter a valid Date of Birth.");
		}
	    
	    //gender
	    String gender = request.getParameter("gender");
	    if(ValidationUtil.isValidGender(gender) && ValidationUtil.isNotEmpty(gender))
		{
	    	sbean.setGender(gender);
		}
		else
		{
			isValid = false;
			request.setAttribute("genderError", "Please select valid gender.");
		}
	    
	    //address
	    String address = request.getParameter("address").replaceAll("\\s+", " ").trim();
	    if(ValidationUtil.isNotEmpty(address))
		{
			sbean.setAddress(address);
		}
		else
		{
			isValid = false;
			request.setAttribute("addressError", "Please enter a valid address");
		}
	    
	    //course
	    String course = request.getParameter("course");
	    if(ValidationUtil.isValidCourse(course))
		{
			sbean.setCourse(course);
		}
		else
		{
			isValid = false;
			request.setAttribute("courseError", "Please select valid course");
		}
	    
	    //batchTime
	    String batchTime = request.getParameter("batchTime");
	    if(ValidationUtil.isValidBatchTime(batchTime))
		{
			sbean.setBatchTime(batchTime);
		}
		else
		{
			isValid = false;
			request.setAttribute("batchTimeError", "Please select valid batchTime");
		}
	    
	    //paymentMode
	    String paymentMode = request.getParameter("paymentMode");
	    if(ValidationUtil.isValidPaymentMode(paymentMode))
		{
			sbean.setPaymentMode(paymentMode);
		}
		else
		{
			isValid = false;
			request.setAttribute("paymentModeError", "Please select valid paymentMode");
		}
	    
	    //interests
	    String interests = request.getParameterValues("interests") != null ? String.join(", ", request.getParameterValues("interests")) : "";
	    if(ValidationUtil.isValidInterest(interests) || !ValidationUtil.isNotEmpty(interests))
	    {
	    	boolean sports = interests.contains("Sports")?true:false;
	    	sbean.setSports(sports);
		    boolean music = interests.contains("Music")?true:false;
		    sbean.setMusic(music);
		    boolean debate = interests.contains("Debate")?true:false;
		    sbean.setDebate(debate);
		    boolean volunteering = interests.contains("Volunteering")?true:false;
		    sbean.setVolunteering(volunteering);
	    }
	    else
	    {
	    	isValid = false;
			request.setAttribute("interestsError", "Please select valid interests");
	    }
	    
	    request.setAttribute("isSubmited", true);
	    	    
	    RequestDispatcher rd = null;
	    if(isValid)
	    {
	    	int rowsAffected = dao.insertStudent(sbean);
			if (rowsAffected > 0) 
			{
				rd = request.getRequestDispatcher("ListStudentServlet"); 
			} else {
				rd = request.getRequestDispatcher("addStudentDetails.jsp");
			}
	    }
	    else
	    {
	    	request.setAttribute("sbean", sbean);
	    	Boolean isEditform = false;
	    	request.setAttribute("isEditform",isEditform);
	    	rd = request.getRequestDispatcher("addStudentDetails.jsp");
	    }
		
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
