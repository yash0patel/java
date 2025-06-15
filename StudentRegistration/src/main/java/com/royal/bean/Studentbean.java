package com.royal.bean;

import java.sql.Date;
import java.sql.Timestamp;


public class Studentbean {
    private int studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
	private Date dob;
    private String gender;
    private String address;
    private String course;
    private String batchTime;
    private String paymentMode;
    private boolean sports;
    private boolean music;
    private boolean debate;
    private boolean volunteering;
    private Timestamp registrationDate;

    public Studentbean()
    {
    	
    }
    
    public Studentbean(int studentId, String firstName, String lastName, String email, String phone, Date dob,
    		String gender, String address, String course, String batchTime, String paymentMode, boolean sports,
    		boolean music, boolean debate, boolean volunteering, Timestamp registrationDate) 
    {
    	this.studentId = studentId;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.email = email;
    	this.phone = phone;
    	this.dob = dob;
    	this.gender = gender;
    	this.address = address;
    	this.course = course;
    	this.batchTime = batchTime;
    	this.paymentMode = paymentMode;
    	this.sports = sports;
    	this.music = music;
    	this.debate = debate;
    	this.volunteering = volunteering;
    	this.registrationDate = registrationDate;
    }
    
    //without registrationDate
    public Studentbean(int studentId, String firstName, String lastName, String email, String phone, Date dob,
    		String gender, String address, String course, String batchTime, String paymentMode, boolean sports,
    		boolean music, boolean debate, boolean volunteering) 
    {
    	this.studentId = studentId;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.email = email;
    	this.phone = phone;
    	this.dob = dob;
    	this.gender = gender;
    	this.address = address;
    	this.course = course;
    	this.batchTime = batchTime;
    	this.paymentMode = paymentMode;
    	this.sports = sports;
    	this.music = music;
    	this.debate = debate;
    	this.volunteering = volunteering;
    }
    
    public String getInterests() {
    	StringBuilder Interests = new StringBuilder();
		if (isSports()) Interests.append("sport ");
		if (isMusic()) Interests.append("music ");
		if (isDebate()) Interests.append("debate ");
		if (isVolunteering()) Interests.append("volunteering");
		return Interests.toString();
    }
    
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBatchTime() {
        return batchTime;
    }

    public void setBatchTime(String batchTime) {
        this.batchTime = batchTime;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public boolean isSports() {
        return sports;
    }

    public void setSports(boolean sports) {
        this.sports = sports;
    }

    public boolean isMusic() {
        return music;
    }

    public void setMusic(boolean music) {
        this.music = music;
    }

    public boolean isDebate() {
        return debate;
    }

    public void setDebate(boolean debate) {
        this.debate = debate;
    }

    public boolean isVolunteering() {
        return volunteering;
    }

    public void setVolunteering(boolean volunteering) {
        this.volunteering = volunteering;
    }

    public Timestamp getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }
}
