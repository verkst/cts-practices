

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dispatcher
 */
public class Dispatcher extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eno1=request.getParameter("employeeID");
		String name1=request.getParameter("employeeName");
		String salary1=request.getParameter("employeeSalary");
		String dept1=request.getParameter("employeeAge");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		
		request.setAttribute("Employeenumber",eno1);  //AttributeName,AttributeValue
		request.setAttribute("Empname",name1);
		request.setAttribute("Salary",salary1);
		request.setAttribute("depart",dept1);
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		ServletContext context=getServletContext();
		RequestDispatcher rd=context.getRequestDispatcher("/Dispatcher4");
		rd.forward(request, response);
	}

}
