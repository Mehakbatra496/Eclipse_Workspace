package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;
import in.sp.services.StudentService;
import in.sp.services.StudentServiceImpl;

public class App
{
    public static void main( String[] args )
    {
		Student std = new Student();
		
		std.setName("fff");
		std.setEmail("fff@gmail.com");
		std.setPassword("fff123");
		std.setGender("m");
		std.setCity("banglore");
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        StudentService stdService = context.getBean(StudentServiceImpl.class);
        boolean status = stdService.addStdDetailsService(std);
        
        if(status)
        {
        	System.out.println("success "+stdService);
        }
        
        else
        {
        	System.out.println("fail");                   
        }
    }
}

