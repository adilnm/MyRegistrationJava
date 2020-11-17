package com.cubic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyRegistrationServlet")
public class MyRegistrationServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String namevalue=request.getParameter("name");
		String locationvalue=request.getParameter("location");
		PrintWriter pw=response.getWriter();
		
		pw.println("Hello Mr. "+namevalue+" from "+locationvalue);
			
				
	}
}
