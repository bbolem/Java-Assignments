package com.btb.ServletAssignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = 3;	//Find a way to increment this
		
		String userName = request.getParameter("username");
		String gender = request.getParameter("gender");
		String duration = request.getParameter("duration");

		String[] languages = request.getParameterValues("language");
		String selLang = "";
		for (String lang : languages) {
			selLang = selLang + " " + lang;
		}
		
		PrintWriter out = response.getWriter();
		//out.println(userName + " " + gender + " " + duration + " " + selLang);
		
		boolean loginSuccess = true;


		if (userName.isEmpty() || gender.isEmpty() || duration.isEmpty() || selLang.isEmpty()) {
			loginSuccess = false;
		}

		if (loginSuccess) {
			
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs;

			try {
				
				Driver driver = new com.mysql.cj.jdbc.Driver();
	            DriverManager.registerDriver(driver);
	            
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");

				pstmt = con.prepareStatement("insert into training.registration values(?,?,?,?,?)");
				pstmt.setInt(1, ++id);
				pstmt.setString(2, userName);
				pstmt.setString(3, gender);
				pstmt.setString(4, duration);
				pstmt.setString(5, selLang);

				pstmt.executeUpdate();
				
				//out.println(id + " " +userName + " " + gender + " " + duration + " " + selLang);
				// System.out.println("Inserting...");

				pstmt = con.prepareStatement("select * from registration");
				rs = pstmt.executeQuery();
				
				while (rs.next()){
	                out.println(rs.getInt("id") + " " + rs.getString("username") + " " + rs.getString("gender") + " " + rs.getString("duration") + rs.getString("language"));
	            }
				//response.sendRedirect("regSucc.html");
				

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (con != null) {
						con.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			//RequestDispatcher rd = request.getRequestDispatcher("./welcome");
			//rd.forward(request, response);
			//rd.include(request, response);
		} else {
			response.sendRedirect("regFail.html");
		}

		// PrintWriter out = response.getWriter();
		// out.println(userName + " " + gender + " " + duration + " " + selLang);
	}
}
