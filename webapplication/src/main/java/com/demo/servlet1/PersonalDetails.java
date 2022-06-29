package com.demo.servlet1;

public class PersonalDetails {
	
	private String firstName;
	private String lastName;
	private String[] hobbies;
	private String qualification;
	
	public PersonalDetails(String firstName,String lastName,String[] hobbies,String qualification)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.hobbies=hobbies;
		this.qualification=qualification;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	

}
