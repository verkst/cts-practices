

import java.io.*;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InitParam1 extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("<h1>Init Parameters Names are:");
		Enumeration enumeration=getServletContext().getInitParameterNames();	//replace Config to Context
		while(enumeration.hasMoreElements()) {
			out.print(enumeration.nextElement());
		}
		ServletContext conl=getServletContext();
		out.println("<h1>Company:"+conl.getInitParameter("Company"));
		out.println("Venue:"+conl.getInitParameter("Venue"));
		out.println("Training:"+conl.getInitParameter("Training"));
		
		out.print("<h1>Company:"+getServletContext().getInitParameter("Company"));
		out.print("Venue:"+getServletContext().getInitParameter("Venue"));
		out.print("Training:"+getServletContext().getInitParameter("Training"));
		
		try {
			Class.forName(getServletContext().getInitParameter("driver"));
			System.out.println("Driver Loaded...");
		}
		catch(ClassNotFoundException f){
			
		}
		
	}
}
