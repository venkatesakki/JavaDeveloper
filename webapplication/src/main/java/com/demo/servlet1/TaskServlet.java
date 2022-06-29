package com.demo.servlet1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TaskServlet
 */
@WebServlet("/")
public class TaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getServletPath();
		System.out.println(action);
		switch(action)
		{
		case "/":
			welcomePage(request,response);
			break;
		case "/add1":
			addDetails(request,response);
			break;
		case "/show1":
			showDetails(request,response);
			break;
		default:
			break;
		}
		
		
	}

	private void showDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String firstName=request.getParameter("txtFirst");
		String lastName=request.getParameter("txtLast");
		String[] hobbies=request.getParameterValues("rd");
		String qualification=request.getParameter("cb");
		
		PersonalDetails pd=new PersonalDetails(firstName, lastName, hobbies, qualification);
		request.setAttribute("added", pd);
		
		request.setAttribute("title", "Personal Details");
		
		RequestDispatcher rd=request.getRequestDispatcher("/showDetails.jsp");
		rd.forward(request, response);
		
	}

	private void addDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         request.setAttribute("title", "Personal Details");
		System.out.println("inside add deaias");
		RequestDispatcher rd=request.getRequestDispatcher("/addDetails.jsp");
		rd.forward(request, response);
		
		
	}

	private void welcomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Personal Details");

		
		RequestDispatcher rd=request.getRequestDispatcher("/welcomePage.jsp");
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
