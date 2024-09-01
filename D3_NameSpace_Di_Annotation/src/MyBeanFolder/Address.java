package MyBeanFolder;
import org.springframework.beans.factory.annotation.Autowired;

public class Address 
{
	int house;
	String city;
	int pincode;

	@Autowired
	public Address(int house, String city, int pincode)
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
