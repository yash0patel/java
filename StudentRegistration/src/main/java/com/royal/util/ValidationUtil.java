package com.royal.util;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ValidationUtil {
	public static boolean isNotEmpty(String value) {
        return value != null && value.trim().length() > 0;
    }
	
	public static boolean isValidName(String name) {
        return name != null && name.matches("^[a-zA-Z\\s]+$") && name.trim().length() > 0;
    }
	
	public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        return email != null && email.matches(emailRegex);
    }
	
	public static boolean isValidPassword(String password) {
	    String passwordRegex = "^(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,}$";
	    return password != null && password.matches(passwordRegex);
	}
	
	public static boolean isValidPhone(String phone) {
        return phone != null && phone.matches("^[0-9]{10}$");
    }
	
	public static boolean isValidGender(String gender) {
	    return gender != null && gender.matches("(?i)Male|Female|Other");
	}
	
	public static boolean isValidCourse(String course) {
	    return course != null && course.matches("(?i)bca|bsc_it|msc_it|mba|engineering|other");
	}
	
	public static boolean isValidBatchTime(String batchTime) {
        return batchTime != null && batchTime.matches("(?i)morning|afternoon|evening");
    }

    public static boolean isValidPaymentMode(String paymentMode) {
        return paymentMode != null && paymentMode.matches("(?i)credit_card|debit_card|net_banking");
    }

    public static boolean isValidInterest(String interests) {
    	String validInterests = "Sports, Music, Debate, Volunteering";
    	return validInterests.contains(interests) && isNotEmpty(interests);
     }

    
    public static boolean isValidDateOrTime(String dateTime) {
    	try {
            LocalDate.parse(dateTime);
            return true;
        } catch (DateTimeParseException e) {
            return false; 
        }
    }
}
