package com.royal.controller;

import java.io.IOException;
import java.util.Scanner;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PrimeNumberServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int count = 0;
		for(int i = 2; i < num;i++)
		{
			if(num%i == 0)
			{	
				count++;
				break;
			}
		}
		if(num == 0)
			System.out.println("Zero");
		else if(count == 0)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
	}
}
