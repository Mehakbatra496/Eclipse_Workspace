package MyBeanFolder;

public class EmployeeBean 
  {
	int officeId , age;
	String name;
	long mobile;
	
	// passing and setting values in constructor
	public EmployeeBean(int officeId, String name, int age, long mobile)
	{
		this.officeId= officeId;
		this.name=name;
		this.age=age;
		this.mobile= mobile;
		
	}
	
	public EmployeeBean(int officeId, String name, int age)
	{
		this.officeId= officeId;
		this.name=name;
		this.age=age;		
		
	}
	
	public void display()
	{
		System.out.println("This is display method");
		System.out.println(officeId+" "+name+" "+age+" "+mobile);
		
	}
	
}
