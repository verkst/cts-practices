

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import java.io.*;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Dispatcher4
 */
public class Dispatcher4 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("Dispatcher 4 Servlet");
		String a= "Employeenumber";
		String b= "Empname";
		String c= "Salary";
		String d= "depart";
		String e= "username";
		String f= "password";
		out.println("<h1> EmpDetails: "+a+" "+b+" "+c+" "+d+" "+e+" "+f);
		
		Connection con=null;
		try {
			Class.forName(getServletContext().getInitParameter("driver"));
			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/verkst","root","root");
			System.out.println("Connecting..,");

			PreparedStatement ps=con.prepareStatement("insert into EmployeeDetails values(EmpID,EmpName,EmpAge,EmpSalary,username,password)");
			ps.execute();
		}
		catch(ClassNotFoundException | SQLException cf) {
			System.out.println(cf);
		}
			//Statement st=con.createStatement();
			//ResultSet rs=st.executeQuery("SELECT * FROM Employee"); (or)
			
			//PreparedStatement ps=con.prepareStatement("INSERT INTO employee(eno,ename) VALUES(?,?)");
			//ps.setInt(1, 101);
			//ps.setString(2, "Verkst");
			//ps.executeUpdate();
			//ps.close();
			
		}
		
		/*
		 * finally { con.setAutoCommit(false); con.commit();
		 * System.out.println("Commit"); }
		 */	
		}

}
