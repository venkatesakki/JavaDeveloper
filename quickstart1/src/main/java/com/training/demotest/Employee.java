package com.training.demotest;

public class Employee {
	
	private int empId,age;
	private String name,designation,phoneNo,salary;
	public Employee()
	{
		
	}
	public Employee(int empId, String name,  int age,String designation, String phoneNo, String salary) {
		
		this.empId = empId;
		this.age = age;
		this.name = name;
		this.designation = designation;
		this.phoneNo = phoneNo;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

}
