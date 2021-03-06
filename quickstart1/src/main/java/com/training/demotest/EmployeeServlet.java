package com.training.demotest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//import jdk.internal.misc.FileSystemOption;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		switch (action) {
		case "/":
			welcomePage(request, response);
			break;
		case "/insert":
			insertServlet(request, response);
			break;
		case "/update":
			updateServlet(request, response);
			break;
		case "/delete":
			deleteServlet(request, response);
			break;
		case "/select":
			select(request, response);
			break;
		case "/selectall":
			selectAll(request, response);
			break;
		case "/view":
			viewServlet(request, response);
			break;

		}
	}

	private void viewServlet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
        
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		// pw.print("save servlet");

		int empId = Integer.parseInt(request.getParameter("txtEmpId"));
		String name = request.getParameter("txtName");
		int age = Integer.parseInt(request.getParameter("txtAge"));
		String designation = request.getParameter("txtDesignation");
		String phoneNo = request.getParameter("txtPhoneNo");
		String salary = request.getParameter("txtSalary");

		Employee e = new Employee(empId, name, age, designation, phoneNo, salary);
//		e.setEmpId(empId);
//		e.setName(name);
//		e.setAge(age);
//		e.setDesignation(designation);
//		e.setPhoneNo(phoneNo);
//		e.setSalary(salary);
//		request.setAttribute("added", e);
		int res = 0;
		

		try {
			res = EmployeeSqlOperation.insert(e);
			System.out.println(res);
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		
		System.out.println("result:" + res);
		if (res > 0) {
//			pw.print("data saves successfully ");
			System.out.println("data save successfully");
			RequestDispatcher rd = request.getRequestDispatcher("/insertEmployee.jsp");
			rd.forward(request, response);
//			response.sendRedirect("/insertEmployee.jsp");
		} else {
			pw.print("data not saves successfully ");
		}

//		request.setAttribute("title", "Employee Details");
		
		
//		request.setAttribute("added", e);
//		RequestDispatcher rd = request.getRequestDispatcher("/viewEmployee.jsp");
//		rd.include(request, response);

	}

	private void welcomePage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("title", "Employee Details");
		RequestDispatcher rd = request.getRequestDispatcher("/welcomeEmployee.jsp");
		rd.forward(request, response);

	}

	private void selectAll(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void select(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void deleteServlet(HttpServletRequest request, HttpServletResponse response) {
		

	}

	private void updateServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		request.setAttribute("title", "Employee Details");
		RequestDispatcher rd = request.getRequestDispatcher("/updateEmployee.jsp");
		rd.forward(request, response);


	}

	private void insertServlet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("title", "Employee Details");
		RequestDispatcher rd = request.getRequestDispatcher("/insertEmployee.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
