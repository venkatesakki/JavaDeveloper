package com.example.demp.model;

import java.util.List;

public interface CrudRepository<T> {
	
	public T add(T t);
	public List<T> findAll();
	public List<T> findByName(String bookName);
	public T removeById(int id);
	public  T updateBook(T t); 
	public T findById(int id);
	
	
	
	
	
//	public T insert(T t);
//	public T findByBookNumber(int bookNumber);
//	public  T delete(int id);
//	public  List<T> getBookAll();
	
	
	
}
