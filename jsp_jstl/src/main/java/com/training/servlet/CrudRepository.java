package com.training.servlet;

import java.util.List;

public interface CrudRepository<T> {
	
	public T add(T t);
	public List<T> findAll();
	public T findByName(String bookName);
	public T insert(T t);
	public T findByBookNumber(int bookNumber);
	public  T update(T t); 
	public  T delete(int e);
	public  List<T> getBookAll();
}
