// this class is in bean folder





package com.example.beans;
public class Student
{
	private String name;
	private int rollno;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(email);

	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	public String getEmail() 
	{
		return email;
	}
}