package com.training.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.connection.ConnectionHub;
import com.training.practice.Student;
import com.training.practice.StudentCall;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private Connection con;
       StudentCall call;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void init() throws ServletException {
		
		super.init();
		con=ConnectionHub.getConnection();
		call=new StudentCall(con);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getServletPath();
		switch(path)
		{
		case "/student":
			findAll(request,response);break;
		}
		
		
	}

	private void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> list=call.viewAll();
		
		request.setAttribute("student", list);
		
		RequestDispatcher dispatcher =request.getRequestDispatcher("/showdetails.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String strStudentId=request.getParameter("studentId");
		int studentId=Integer.parseInt(strStudentId);
		
		String studentName=request.getParameter("studentName");
		
		String studentMailid=request.getParameter("studentMailid");
		
		String strStudentMobileNumber=request.getParameter("studentMobileNumber");
		
		int studentMobileNumber=Integer.parseInt(strStudentMobileNumber);
		
		String studentAddress=request.getParameter("studentAddress");
		
		Student s=call.add(new Student(studentId, studentName, studentMobileNumber, studentMailid, studentAddress));
		
		
		System.out.println(s);
		
		request.setAttribute("added", s);
		request.setAttribute("message", "one student added");
		RequestDispatcher dispatcher=request.getRequestDispatcher("/add.jsp");
		dispatcher.forward(request, response);
		
		
		
	}

}
