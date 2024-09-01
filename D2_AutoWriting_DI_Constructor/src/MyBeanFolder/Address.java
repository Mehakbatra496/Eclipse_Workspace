package MyBeanFolder;

public class Address 
{
	int house;
	String city;
	int pincode;

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
