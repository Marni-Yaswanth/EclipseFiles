package com.capgemini.springmvc.secondApplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/welcome.do")
public class LoginServlet extends HttpServlet{

	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException
	{
		
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		
	}
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException
	{
//		String nameString= request.getParameter("name");
//		request.setAttribute("name", nameString);
		String nameString= request.getParameter("name");
		String passString = request.getParameter("password");
		request.setAttribute("name", nameString);
		request.setAttribute("password", passString);
		Validation user = new Validation(); 
		if (user.isValid(nameString, passString))
		request.getRequestDispatcher("/WEB-INF/views/afterValidation.jsp").forward(request, response);
		else {
			request.setAttribute("error", "invalid credentials found");
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
			
		}
		
		
	}
}
