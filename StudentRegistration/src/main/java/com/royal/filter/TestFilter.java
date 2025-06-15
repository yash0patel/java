package com.royal.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;

public class TestFilter extends HttpFilter implements Filter {
       
	private static final long serialVersionUID = 1L;

	public void init(FilterConfig fConfig) throws ServletException 
	{
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		// TODO Auto-generated method stub
		// place your code here
		
		// Pre-Filtering--request
		System.out.println("TestFilter : Pre-Fitering--doFilter()");
		// pass the request along the filter chain
		chain.doFilter(request, response);

		// 	Post-Filtering--response
		System.out.println("TestFilter : Post-Fitering--doFilter()");
	}
	
	public void destroy() 
	{
		
	}
}
