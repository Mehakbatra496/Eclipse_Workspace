package MyBeanFolder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class Student
{
	public Student(int a)
	{
		System.out.println("constructor invoked");
	}
	
	private String name;
	private int rollno;
	
	public String getName() {
		System.out.println("name getter method invoked");
		return name;
	}
	public void setName(String name) {
		System.out.println("name setter method invoked");
		this.name = name;
	}
	public int getRollno() {
		System.out.println("rollno getter method invoked");
		return rollno;
	}
	public void setRollno(int rollno) {
		System.out.println("rollno setter method invoked");
		this.rollno = rollno;
	}
	
	public void displayResult()
	{
		System.out.println("method invoked");
		System.out.println("Name : "+name);
		System.out.println("Rollno : "+rollno);
	}
	
	
}