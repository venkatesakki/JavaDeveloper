package com.training.practice;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentMailid;
	private int studentMobileNumber;
	private String studentAddress;
	
	public Student(int studentId, String studentName,int studentMobileNumber, String studentMailid, 
			String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMailid = studentMailid;
		this.studentMobileNumber = studentMobileNumber;
		this.studentAddress = studentAddress;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentMailid() {
		return studentMailid;
	}
	public void setStudentMailid(String studentMailid) {
		this.studentMailid = studentMailid;
	}
	public int getStudentMobileNumber() {
		return studentMobileNumber;
	}
	public void setStudentMobileNumber(int studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMailid=" + studentMailid
				+ ", studentMobileNumber=" + studentMobileNumber + ", studentAddress=" + studentAddress + "]";
	}

}
