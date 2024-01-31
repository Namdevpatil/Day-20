package com.basicDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/DemoServlet")
public class DemoServlet1 extends HttpServlet 
{
	
	private static final long serialVersionUID = 1L;
   
    public DemoServlet1() 
    {
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");//1.content-type
		
		PrintWriter printWriter = response.getWriter();//2.PrintWriter object created
		
		String message = request.getParameter("text-message");
		
		printWriter.print(message);
		
	}

}
