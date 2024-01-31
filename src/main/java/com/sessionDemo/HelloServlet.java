package com.sessionDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet
{	

	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");//1.content-type
		
		PrintWriter printWriter = response.getWriter();//2.PrintWriter object created
		
		HttpSession httpSession = request.getSession(false);
		
		String message1 = (String) httpSession.getAttribute("token");
		
		printWriter.print(message1+" HelloServlet");		
		
	}

}
