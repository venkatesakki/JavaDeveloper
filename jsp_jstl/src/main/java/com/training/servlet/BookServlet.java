package com.training.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.repos.BookRepository;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BookService service;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
  

	@Override
	public void init() throws ServletException {
		 try {
			service=new BookService();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action=request.getServletPath();
		System.out.println(action);
		switch(action)
		{
		
		case "/findAll":
			findsAll(request,response);break;
			
		case "/byName":
		findByName(request,response);break;
		
		
		case "/byId":
		findByid(request,response);break;
		
//		case "/insert":
//			insertBook(request,response);break;
		}
	}


//	private void insertBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		String strBookNumber =request.getParameter("bookNumber");
//		int bookNumber=Integer.parseInt(strBookNumber);
//		String bookName =request.getParameter("bookName");
//		String autherName =request.getParameter("autherName");
//		String strPrice=request.getParameter("price");
//		double price=Double.parseDouble(strPrice);
//		
//		Book entity=new Book(bookNumber,bookName,autherName,price);
//		
//		
//		
//		request.setAttribute("insert", bookAdded);
//		RequestDispatcher dispatcher =request.getRequestDispatcher("/success.jsp");
//		dispatcher.forward(request, response);
//		
//		
//	}


	private void findByid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strBookNumber=request.getParameter("bookNumber");
		int bookNumber=Integer.parseInt(strBookNumber);
		Book findBook=service.findBybookNumber(bookNumber);
		
		request.setAttribute("search", findBook);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/showByName.jsp");
		dispatcher.forward(request, response);
		
		
	}


	private void findsAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Book> bookList=service.findAll();
		//Book java=new Book(100,"poniyn selven","kalki",430.0);
		
		//request.setAttribute("book", java);
		request.setAttribute("books", bookList);


		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/showBook.jsp");
		dispatcher.forward(request, response);
	}


	private void findByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bookName=request.getParameter("bookName");
		Book findBook=service.findByName(bookName);
		
		
		request.setAttribute("search", findBook);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/showByName.jsp");
		dispatcher.forward(request, response);
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strBookNumber =request.getParameter("bookNumber");
		int bookNumber=Integer.parseInt(strBookNumber);
		String bookName =request.getParameter("bookName");
		String autherName =request.getParameter("autherName");
		String strPrice=request.getParameter("price");
		double price=Double.parseDouble(strPrice);
		
		
		Book entity=new Book(bookNumber,bookName,autherName,price);
		
		//Book bookAdded=service.add(entity);
		Book bookAdded=service.insert(entity);
		request.setAttribute("added", bookAdded);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);
	}

}
