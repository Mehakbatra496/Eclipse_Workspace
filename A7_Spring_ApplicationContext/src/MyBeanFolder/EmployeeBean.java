package MyBeanFolder;

public class EmployeeBean 
  {
	int officeId , age;
	String name;
	long mobile;
	public int getOfficeId() {
		return officeId;
	}

	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
	public long getMobile() 
	{
		return mobile;
	}
	
}
