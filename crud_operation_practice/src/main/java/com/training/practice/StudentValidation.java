package com.training.practice;

public class StudentValidation {
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean validation()
	{
		boolean result=false;
		if(userName.equals("gopal") && password.equals("bala"))
		{
			result= true;
		}
		return result;
	}

}
