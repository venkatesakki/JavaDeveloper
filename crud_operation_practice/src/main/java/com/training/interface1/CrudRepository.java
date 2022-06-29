package com.training.interface1;

import java.util.List;

public interface CrudRepository<T> {
	
	public T add(T t);
	public List<T> viewAll();
	public T upadte(T t);
	public T delete(int id);
	public List<T> search(String employeeName);
 	

}
