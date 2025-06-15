package com.royal.bean;

public class Registerbean {
	private int rno;
	private String fname = null;
	private String lname = null;
	private String dob = null;
	private String email = null;
	private String password = null;
	private String gender = null;
	private String hobbies = null;
	
	public Registerbean(int rno2,String fname,String lname,String dob,String email,String password,String gender,String hobbies) {
		this.rno = rno2;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.hobbies = hobbies;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
