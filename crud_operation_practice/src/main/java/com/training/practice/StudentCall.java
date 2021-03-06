package com.training.practice;

import java.sql.Connection;
import java.util.List;

import com.training.interface1.CrudRepository;

public class StudentCall {
	private Connection con;
    private CrudRepository<Student> stu;
    
	public StudentCall(Connection con) {
		super();
		// TODO Auto-generated constructor stub
		this.stu=new StudentRespository(con);
	}
	
	public Student add(Student s) 
	{
		return this.stu.add(s);
	}
	public List<Student> viewAll() 
	{
		return this.stu.viewAll();
	}
	public Student upadte(Student s) 
	{
		return this.stu.upadte(s);
	}
	public Student delete(int id) 
	{
		return this.stu.delete(id);
	}
	public List<Student> search(String studentName) 
	{
		return this.stu.search(studentName);
	}	
}
