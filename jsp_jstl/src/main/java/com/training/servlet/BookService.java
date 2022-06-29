package com.training.servlet;
import java.sql.SQLException;
import java.util.*;

import com.training.repos.BookRepository;

public class BookService {
	
	private CrudRepository<Book> repo;
	public BookService() throws SQLException
	{
		this.repo=new BookRepository();
//		this.bookList=Arrays.asList(new Book(100,"poniyn selven","kalki",430.0),
//				new Book(101,"sivakamiyn sabatham ","kalki",320.0),
//				new Book(102," thaneer dhesam ","vairamuthu",320.0)
				//);	
	}
	public List<Book> findAll()
	{
		this.repo.add(new Book(101,"java","kathi",450));
		return this.repo.findAll();
	}
	public Book add(Book entity)
	{
		return this.repo.add(entity);
	}
	public Book findByName(String bookName)
	{
		return this.repo.findByName(bookName);
	}
	public Book insert(Book t)
	{
		return this.repo.insert(t);
		
	}
	public Book findBybookNumber(int bookNumber)
	{
		return this.repo.findByBookNumber(bookNumber);
	}

}
