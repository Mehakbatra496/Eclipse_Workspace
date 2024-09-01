package MyBeanFolder;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class EmployeeBean 
  {
	int officeId , age;
	String name;
	long mobile;
	
	
	Address add;
	
	// passing and setting values in constructor
//	public EmployeeBean(int officeId, String name, int age)
//	{
//		this.officeId= officeId;
//		this.name=name;
//		this.age=age;			
//	}
	
	public EmployeeBean(@Value("301") int officeId, @Value("Meenashi") String name,@Value("20") int age,@Value("546346536") long mobile, Address add)
	{
		this.officeId= officeId;
		this.name=name;
		this.age=age;	
		this.mobile= mobile;
		this.add= add;
	}
	
	public void display()
	{
		System.out.println("This is display method");
		System.out.println(officeId+" "+name+" "+age+" "+mobile+" "+add);
		
	}
}
