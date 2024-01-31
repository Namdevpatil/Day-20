package com.basicDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/HelloServlet")
public class Hello implements Servlet 
{

	@Override
	public void destroy() 
	{
		System.out.println("servlet destroyed");

	}

	@Override
	public ServletConfig getServletConfig() 
	{
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		
		System.out.println("servlet initialized.");

	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter printWriter = response.getWriter();
		
		String message = "Service method called.";
		
		printWriter.print(message);		
		
	}

}
