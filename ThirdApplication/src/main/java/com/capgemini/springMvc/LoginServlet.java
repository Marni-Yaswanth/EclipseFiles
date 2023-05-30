package com.capgemini.springMvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns  = "/welcome")
public class LoginServlet extends HttpServlet{

	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
		PrintWriter outPrintWriter = response.getWriter();
		outPrintWriter.println("hiii this is new page");
	}
	
	
	
}
