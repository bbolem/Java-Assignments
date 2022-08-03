package com.btb.ServletAssignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.RequestDispatcher;

@WebServlet("/login")
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;

//	public void init() {
//		System.out.println("From HTTPServlet init...");
//	}

	// Either service or do method should be written
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
		try {
			
			Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root");
			PreparedStatement pstmt = conn.prepareStatement("Select * from user where user_name = ? and password = ?");
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				out.println("Welcome " + userName);
			} else { 
				out.println("Please enter correct credentials");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean loginSuccess = true;


		if (userName.isEmpty() || password.isEmpty()) {
			loginSuccess = false;
		}
	
		
		if (loginSuccess) {
			response.sendRedirect("./welcome.html");
			//RequestDispatcher rd = request.getRequestDispatcher("./welcome");
			//rd.forward(request, response);
			//rd.include(request, response);
		} else {
			response.sendRedirect("./loginError.html");
		}
		
//		out.println("Hi...<br/>");
//		out.println("Username: " + userName + "<br/>");
//		out.println("Password: " + password);
//		out.println("From login servlet.");
		
	}

}
