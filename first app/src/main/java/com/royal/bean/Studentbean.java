package com.royal.bean;

public class Studentbean {
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	public Studentbean(int rno, String name, int std, int marks) {
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
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
	
	
}
