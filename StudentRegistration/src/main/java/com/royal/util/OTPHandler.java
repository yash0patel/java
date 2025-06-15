package com.royal.util;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class OTPHandler 
{
	public static String generateOTP(int length) 
    {
        String digits = "0123456789";
        Random random = new Random();
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < length; i++) 
        {
            otp.append(digits.charAt(random.nextInt(digits.length())));
        }
        return otp.toString();
    }
	
	public static Boolean verifyOTP(String userOTP, String generatedOTP) 
	 {
	        if (generatedOTP != null && userOTP != null && generatedOTP.equals(userOTP)) {    
	            return true;
	        } else {
	            return false;
	        }
	 }
	
	public static String sendMail(String recipientEmail,String username) 
	{
        final String senderEmail = "********@gmail.com";
        final String senderPassword = "**** **** **** ****";

        // Generate OTP
        String otp = generateOTP(6); 
        
        System.out.println("Generated OTP: " + otp);

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.starttls.required", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Your OTP Code");

  
            String htmlMessage = "<!DOCTYPE html>\r\n"
                    + "<html>\r\n"
                    + "<head>\r\n"
                    + "    <meta charset='UTF-8'>\r\n"
                    + "    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\r\n"
                    + "    <title>Your OTP Code</title>\r\n"
                    + "    <style>\r\n"
                    + "        body {\r\n"
                    + "            font-family: Arial, sans-serif;\r\n"
                    + "            background-color: #f4f4f4;\r\n"
                    + "            margin: 0;\r\n"
                    + "            padding: 0;\r\n"
                    + "        }\r\n"
                    + "        .container {\r\n"
                    + "            max-width: 500px;\r\n"
                    + "            margin: 40px auto;\r\n"
                    + "            background-color: #ffffff;\r\n"
                    + "            padding: 20px;\r\n"
                    + "            border-radius: 8px;\r\n"
                    + "            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\r\n"
                    + "            text-align: center;\r\n"
                    + "        }\r\n"
                    + "        .header {\r\n"
                    + "            font-size: 22px;\r\n"
                    + "            font-weight: bold;\r\n"
                    + "            color: #333333;\r\n"
                    + "        }\r\n"
                    + "        .otp-box {\r\n"
                    + "            font-size: 28px;\r\n"
                    + "            font-weight: bold;\r\n"
                    + "            color: #ffffff;\r\n"
                    + "            background-color: #ff3b3b;\r\n"
                    + "            padding: 15px 25px;\r\n"
                    + "            border-radius: 5px;\r\n"
                    + "            display: inline-block;\r\n"
                    + "            margin: 20px 0;\r\n"
                    + "        }\r\n"
                    + "        .message {\r\n"
                    + "            font-size: 16px;\r\n"
                    + "            color: #444444;\r\n"
                    + "            line-height: 1.5;\r\n"
                    + "        }\r\n"
                    + "        .footer {\r\n"
                    + "            font-size: 12px;\r\n"
                    + "            color: #888888;\r\n"
                    + "            margin-top: 20px;\r\n"
                    + "        }\r\n"
                    + "    </style>\r\n"
                    + "</head>\r\n"
                    + "<body>\r\n"
                    + "    <div class='container'>\r\n"
                    + "        <h2 class='header'>Hello <strong>" + (username != null && username.trim() != "" ? username : "user") + "</strong>,</h2>\r\n"
                    + "        <p class='message'>Use the following OTP to complete your login:</p>\r\n"
                    + "        <div class='otp-box'>" + otp + "</div>\r\n"
                    + "        <p class='message'>This OTP is valid for **5 minutes**. Do not share it with anyone.</p>\r\n"
                    + "        <p class='footer'>If you did not request this, please ignore this email. Contact support if needed.</p>\r\n"
                    + "    </div>\r\n"
                    + "</body>\r\n"
                    + "</html>";


            message.setContent(htmlMessage, "text/html");
            
            Transport.send(message);
            System.out.println("Email sent successfully with OTP: " + otp);
        } catch (MessagingException e) {
            e.printStackTrace();
        }	
        return otp;
	}
	
	
	
    public static void main(String[] args) 
    {
    	try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Your Email id : ");
			String recipientEmail = sc.nextLine();
			
			sendMail(recipientEmail,"");
		}
    }

    
}
