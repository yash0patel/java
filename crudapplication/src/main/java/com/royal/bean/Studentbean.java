package com.royal.bean;

public class Studentbean {
	private int rno;
	private String name;
	private int std;
	private int marks;
	private String gender;
	private String hobbies;
	private String resourcepath;


	public Studentbean(int rno, String name, int std, int marks, String gender, String hobbies, String resourcepath) {
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
		this.gender = gender;
		this.hobbies = hobbies;
		this.resourcepath = resourcepath;
	}

	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getResourcepath() {
		return resourcepath;
	}
	public void setResourcepath(String resourcepath) {
		this.resourcepath = resourcepath;
	}


}
