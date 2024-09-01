package MyBeanFolder;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address 
{
	int house;
	String city;
	int pincode;

	public Address(@Value("47") int house, @Value("Gumthala Rao") String city, @Value("133135")int pincode)
	{
		this.house=house;
		this.city=city;
		this.pincode= pincode;
		
	}	
	
	public String toString()
	{
		return "'"+ "#"+house+", "+city+", "+pincode+"'";		
	}
}

