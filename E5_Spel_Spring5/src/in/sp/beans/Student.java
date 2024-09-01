package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stdId")
public class Student
{
	@Value("Karina")
	private String name;

	private Address address;
	
	@Value("#{addrId.getCity()}")	
	private String city;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("City : "+city);
	}
}
