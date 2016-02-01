package com.jspTags;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspTags.models.Employee;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet(name="HomeServlet" ,urlPatterns={"/HomeServlet"})
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//out.println("Hi there");
		List<Employee>employees= new ArrayList<>();
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		Employee emp4=new Employee();
		emp1.setId(101);
		emp1.setName("Spock");
		emp1.setRole("Second officer");
		//Emp2
		emp2.setId(102);
		emp2.setName("Kirk");
		emp2.setRole("Captain");
		//Emp3
		emp3.setId(103);
		emp3.setName("Macoy");
		emp3.setRole("Medical officer ");
		//Emp4
		emp4.setId(104);
		emp4.setName("Scoty");
		emp4.setRole("Transport  officer");
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		RequestDispatcher disp=request.getRequestDispatcher("/details.jsp");
		request.setAttribute("emps",employees);
		disp.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
