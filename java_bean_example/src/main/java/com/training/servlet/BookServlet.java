package com.training.servlet;
import com.example.demp.model.BookService;
import com.training.utils.*;
import com.example.demp.model.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Connection con=null;
    private BookService service;
 /**
  * @see HttpServlet#HttpServlet()
  */
 public BookServlet() {
     super();
     // TODO Auto-generated constructor stub
 }

	@Override
	public void destroy() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void init() throws ServletException {
		
		try {
			con=ConnectionFactory.getPostgresConnection();
			service =new BookService(con);
			System.out.println("Connection :="+con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String key =request.getServletPath();
		System.out.println(key);
		switch (key) {
		case "/books": 
			handleFindAll(request, response);
			break;
		
        case "/delete": 
			handleRemove(request, response);
			break;
		
        case "/edit": 
			handleEdit(request, response);
			break;
        case "/byName": 
			findByName(request, response);
			break;
		
        
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}	
	}

	

	private void findByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bookName=request.getParameter("bookName");
		
		
		List<Book> books=service.findByName(bookName);
		
		//request.setAttribute("books", book);
		//List<Book> books=service.findAll();
		request.setAttribute("books", books);
		
		RequestDispatcher dispatcher =request.getRequestDispatcher("/showBook.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String key=request.getServletPath();
		
		switch(key) {
	case "/update": 
		handleUpdate(request, response);
		break;
	case "/add": 
		handleAdd(request, response);
		break;
	
	
	default:
		throw new IllegalArgumentException("Unexpected value: " + key);
	}	
		
		
		
	}
	private void handleAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String strBookNumber =request.getParameter("bookNumber");
		int bookNumber=Integer.parseInt(strBookNumber);
		String bookName =request.getParameter("bookName");
		String autherName =request.getParameter("authorName");
		String strPrice=request.getParameter("price");
		double price=Double.parseDouble(strPrice);
		
		
		Book entity=new Book(bookNumber,bookName,autherName,price);
		
	    service.add(entity);
		//Book bookAdded=service.insert(entity);
		
		request.setAttribute("added", entity);
		request.setAttribute("message", "one Book Added");
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/addBook.jsp");
		dispatcher.forward(request, response);
		
	}

	public void handleRemove(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		String strId=request.getParameter("id");
		int id=Integer.parseInt(strId);
		
		Book book=service.remove(id);
		
		//request.setAttribute("books", book);
		List<Book> books=service.findAll();
		request.setAttribute("books", books);
		
		RequestDispatcher dispatcher =request.getRequestDispatcher("/showBook.jsp");
		dispatcher.forward(request, response);
		
		
	}
	public void handleFindAll(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		List<Book> books=service.findAll();
		request.setAttribute("books", books);
		RequestDispatcher dispatcher =request.getRequestDispatcher("/showBook.jsp");
		dispatcher.forward(request, response);	
	}
	private void handleUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strBookNumber =request.getParameter("bookNumber");
		int bookNumber=Integer.parseInt(strBookNumber);
		String bookName =request.getParameter("bookName");
		String autherName =request.getParameter("authorName");
		String strPrice=request.getParameter("price");
		double price=Double.parseDouble(strPrice);
		
		
		Book entity=new Book(bookNumber,bookName,autherName,price);
		
		Book bookUpdated=service.update(entity);
		
		request.setAttribute("updated", bookUpdated);
		if(bookUpdated!=null) {
		request.setAttribute("message", "one Book upaded");}
		else {
			request.setAttribute("message", "Error in updatation");
		}
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/addBook.jsp");
		dispatcher.forward(request, response);
		
	}
	public void handleEdit(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		String strId=request.getParameter("id");
		int id=Integer.parseInt(strId);
		
		Book bookToEdit =service.findById(id);
		request.setAttribute("bookToEdit", bookToEdit);
		
		RequestDispatcher dispatcher =request.getRequestDispatcher("/addBook.jsp");
		dispatcher.forward(request, response);
		
		
	}
	
	

}

