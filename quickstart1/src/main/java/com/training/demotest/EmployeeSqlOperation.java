package com.training.demotest;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.sql.Connection;



public class EmployeeSqlOperation {
	private static String INSERT="insert into employee (emp_id,name,age,designation,phone_no,salary) values(?,?,?,?,?,?);";
	private static String UPDATE ="update employee set designation=?,salary=? where emp_id=?;";
	private static String DELETE="delete from employee where emp_id=?;";
	private static String SELECTALL="select * from employee;";
	private static String SALCOND="select name from employee where sal>=300000;";
	
	public static int insert(Employee e) throws SQLException
	{
		int res=0;
		try
		{
		Connection con =DBConection.getConnection();
		
		PreparedStatement ps=con.prepareStatement(INSERT);
		
		ps.setInt(1, e.getEmpId());
		ps.setString(2,e.getName());
		ps.setInt(3, e.getAge());
		ps.setString(4, e.getDesignation());
		ps.setString(5, e.getPhoneNo());
		ps.setString(6, e.getSalary());
	
		res=ps.executeUpdate();
		//ps.close();
		con.close();
		}
		catch (Exception e1) {
			e1.printStackTrace();
			
		}
		return res;
	}
	public static int update(Employee e) 
	{
	    int res=0;
	try
	{
	    Connection con =DBConection.getConnection();
	    PreparedStatement ps=con.prepareStatement(UPDATE);
	    
	    ps.setInt(3, e.getEmpId());
	    ps.setString(1, e.getDesignation());
	    ps.setString(2, e.getSalary());
	
	    res=ps.executeUpdate();
       
        con.close();
        ps.close();
	}
	catch (Exception e1) 
	{
		e1.printStackTrace();
	}
	    return res;
	}
	
	public static int delete(int empId) throws SQLException
	{
	    int res=0;
	try
	{
	    Connection con =DBConection.getConnection();
	    PreparedStatement ps=con.prepareStatement(DELETE);
	 
	    ps.setInt(1,empId);
	    res=ps.executeUpdate();
	   // ps.close();
	    con.close();
	    ps.close();
	}
	catch (Exception e1) {
		e1.printStackTrace();
	}
	
	    return res;
	}
	public static List<Employee> getEmployeeAll()
	{
		List<Employee> list = new ArrayList<Employee>();
		try
		{
			Connection con = DBConection.getConnection();
			PreparedStatement ps=con.prepareStatement(SELECTALL);
			ResultSet re = ps.executeQuery();
			while(re.next())
			{
				Employee e=new Employee();
				
				e.setEmpId(re.getInt(2));
				e.setName(re.getString(3));
				e.setAge(re.getInt(4));
				e.setDesignation(re.getString(5));
				e.setPhoneNo(re.getString(6));
				e.setSalary(re.getString(7));
				list.add(e);
			}
			con.close();
			 ps.close();
		}
		catch (Exception e) {
			e.printStackTrace();	
		}
		
		return list;
	}
	public static List<Employee> getSal()
	{
		List<Employee> list = new ArrayList<Employee>();
		try
		{
			Connection con = DBConection.getConnection();
			PreparedStatement ps=con.prepareStatement(SALCOND);
			ResultSet re = ps.executeQuery();
			while(re.next())
			{
				Employee e=new Employee();
				
				e.setSalary(re.getString(1));
				
				list.add(e);
			}
			con.close();
			 ps.close();
		}
		catch (Exception e) {
			e.printStackTrace();	
		}
		
		return list;
	}

}
