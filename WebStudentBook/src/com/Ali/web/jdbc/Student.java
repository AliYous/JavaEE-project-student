package com.Ali.web.jdbc;

public class Student {
	private int id;
	private String first_Name;
	private String last_Name;
	private String email;
	public int getId() {
		return id;
	}
	
	//Constructor
	public Student(int id, String first_Name, String last_Name, String email) {
		super();
		this.id = id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email = email;
	}
	public Student(String first_Name, String last_Name, String email) {
		super();
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email = email;
	}
	

	//Setters and getters
	public void setId(int id) {
		this.id = id;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", first_Name=" + first_Name + ", last_Name=" + last_Name + ", email=" + email + "]";
	}
	
	
}
