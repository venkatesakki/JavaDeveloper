package com.training.repos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.training.servlet.*;
import com.training.servlet.Book;
import com.training.servlet.CrudRepository;

public class BookRepository implements CrudRepository<Book> {
	
	private static String INSERT="insert into book (book_number,book_name,author_name,price) values(?,?,?,?);";
	private static String UPDATE ="update employee set designation=?,salary=? where emp_id=?;";
	private static String DELETE="delete from employee where emp_id=?;";
	private static String SELECTALL="select * from book;";
	Connection con;
	private List<Book> bookList;

	public BookRepository() throws SQLException {

		 //con=DriverManager.getConnection("org.postgresql.Driver");
		DBConnection.getConnection();
		this.bookList = new ArrayList<Book>();

	}
	@Override
	public Book add(Book t) {
		Boolean isAdded = this.bookList.add(t);
		if (isAdded) {
			return t;
		} else {
			return null;
		}
		
		//PreparedStatement pstm=con.prepareStatement("insert into book (book_number,book_name,auther_name,price) value(?,?,?,?)");
	}
	@Override
	public List<Book> findAll() {
		List<Book> list = new ArrayList<Book>();
		try
		{
			Connection con = DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement(SELECTALL);
			ResultSet re = ps.executeQuery();
			while(re.next())
			{
				Book t=new Book();
				
				t.setBookNumber(re.getInt(2));
				t.setBookName(re.getString(3));
				t.setAuthorName(re.getString(4));
				t.setPrice(re.getDouble(5));
				list.add(t);
			}
			con.close();
			 ps.close();
		}
		catch (Exception e) {
			e.printStackTrace();	
		}
		
		return list;
		
	}
	@Override
	public Book findByName(String bookName) {
	Optional<Book> found=this.bookList.stream().filter(e -> e.getBookName().equals(bookName)).findAny();
		return found.get();
	}
	@Override
	public Book insert(Book t) {
		
		try
		{
		Connection con =DBConnection.getConnection();
		
		PreparedStatement ps=con.prepareStatement(INSERT);
		
		ps.setInt(1, t.getBookNumber());
		ps.setString(2,t.getBookName());
		ps.setString(3, t.getAuthorName());
		ps.setDouble(4,t.getPrice());
		
		ps.executeUpdate();
		
		con.close();
		}
		catch (Exception e1) {
			e1.printStackTrace();
			
		}
		return t;	
		}
	@Override
	public Book update(Book t) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Book delete(int e) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Book> getBookAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Book findByBookNumber(int bookNumber) {
		Optional<Book> found=this.bookList.stream().filter(e -> e.getBookNumber()==bookNumber).findAny();
		return found.get();
	}
	
	
	
	}

	
	


