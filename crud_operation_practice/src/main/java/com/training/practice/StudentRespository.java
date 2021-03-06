package com.training.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.training.interface1.CrudRepository;

public class StudentRespository implements CrudRepository<Student>{
	private Connection con;
	
	public StudentRespository(Connection con) {
		super();
		this.con=con;
	}

	@Override
	public Student add(Student s) {
		
		String insert="insert into student(student_id,student_name,student_mailid,student_mobilenumber,student_address) values(?,?,?,?,?);";
		
		try {
			
			PreparedStatement ps=con.prepareStatement(insert);
			
			ps.setInt(1, s.getStudentId());
			ps.setString(2, s.getStudentName());
			ps.setString(3, s.getStudentMailid());
			ps.setInt(4, s.getStudentMobileNumber());
			ps.setString(5, s.getStudentAddress());
			
			ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}

	@Override
	public List<Student> viewAll() {
		List<Student> studentList = new ArrayList<>();
       String sql="select * from student;";
       try
       {
    	   PreparedStatement ps=con.prepareStatement(sql);
    	   
    	    ResultSet rs=ps.executeQuery();
    	    while(rs.next())
    	    {
    	    	int studentId=rs.getInt("student_id");
    	    	String studentName =rs.getString("student_name");
    	    	String studentMailid= rs.getString("student_mailid");
    	    	int studentMobileNumber=rs.getInt("student_mobilenumber");
    	    	String studentAddress=rs.getString("student_address");
    	    	
    	    	Student s=new Student(studentId, studentName, studentMobileNumber, studentMailid, studentAddress);
    	    	studentList.add(s);
    	    }
       }catch (Exception e) {
		e.printStackTrace();
	}
		return studentList;
	}

	@Override
	public Student upadte(Student t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> search(String studentName) {
		// TODO Auto-generated method stub
		return null;
	}
		
}
