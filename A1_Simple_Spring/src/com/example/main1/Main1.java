// this class is in main folder

package com.example.main1;

import com.example.beans.*;
public class Main1 
{
	public static void main(String[] args) 
	{
		Student stdObj = new Student();
		
		stdObj.setName("Mehak");
		stdObj.setRollno(101);
		stdObj.setEmail("mhk@gmail.com");
		
		stdObj.display();
	}
}