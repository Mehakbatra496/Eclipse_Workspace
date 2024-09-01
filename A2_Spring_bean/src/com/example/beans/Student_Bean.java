package com.example.beans;

public class Student_Bean  // a bean class to set and retrieve bean
{
		private String name1, clas1;
		private int rollno1;
		
		// setter methods		
		public void setName(String name) 
		{
			 name1=name;
		}
		public void setClas(String clas) 
		{
			 clas1= clas;
		}
		public void setRollno(int rollno) 
		{
			 rollno1= rollno;
		}
		
		// getter methods		
		public String getName() 
		{
			return name1;
		}
		
		public String getClas() 
		{
			return clas1;
		}
		public int getRollno() 
		{
			return rollno1;
		}
			
		public void display() 
		{

			System.out.print(name1+" "+clas1+"  "+rollno1);
		}
	
}
