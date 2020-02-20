

import java.io.IOException;

import java.io.*;
import java.sql.DriverManager;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet{   //GenericServlet
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter();
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		pw.println(s1+" "+s2);
		
		try {
			String url=getServletContext().getInitParameter("url");
			String usr=getServletContext().getInitParameter("user");
			String pass=getServletContext().getInitParameter("password");
			
			Class.forName(getServletContext().getInitParameter("driver"));
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/verkst","root","root");
			System.out.println("Connecting..,");
		}
		catch(ClassNotFoundException | SQLException cf) {
			System.out.println(cf);
		}
	}
}
