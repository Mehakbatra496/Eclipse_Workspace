package in.sp.main;

import in.sp.beans.Student;
import in.sp.service.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ss = new Student();
		
		ss.setName("Mhk Batra");
		ss.setEmail("mhk@gmail.com");
		
		StudentService stdService = new StudentServiceImpl();

		boolean status = stdService.addStdDetailsService(ss);
		if(status)
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}

}
