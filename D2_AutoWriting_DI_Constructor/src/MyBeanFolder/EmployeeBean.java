package MyBeanFolder;

public class EmployeeBean 
  {
	int officeId , age;
	String name;
	long mobile;
	Address add;
	
	// passing and setting values in constructor
	public EmployeeBean(int officeId, String name, int age)
	{
		this.officeId= officeId;
		this.name=name;
		this.age=age;
			
	}
	
	public EmployeeBean(int officeId,String name,int age,long mobile, Address add)
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
