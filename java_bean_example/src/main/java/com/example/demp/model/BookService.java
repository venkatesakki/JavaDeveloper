package com.example.demp.model;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;



public class BookService {
	private Connection con;
	private CrudRepository<Book> repo;
	
	public BookService(Connection con) throws SQLException
	{
		this.con=con;
		//this.repo=new BookRepository();
		this.repo=new DBBookRepository(con);
		
//		this.bookList=Arrays.asList(new Book(100,"poniyn selven","kalki",430.0),
//				new Book(101,"sivakamiyn sabatham ","kalki",320.0),
//				new Book(102," thaneer dhesam ","vairamuthu",320.0)
				//);	
	}
	public List<Book> findAll()
	{
		//this.repo.add(new Book(101,"java","kathi",450));
		return this.repo.findAll();
	}
	public Book add(Book entity)
	{
		return this.repo.add(entity);
	}
	public List<Book> findByName(String bookName)
	{
		return this.repo.findByName(bookName);
	}
	public Book remove(int id)
	{
		return this.repo.removeById(id);
	}
	public Book findById(int id)
	{
		return this.repo.findById(id);
	}
	public Book update(Book t)
	{
		return this.repo.updateBook(t);
	}

}
