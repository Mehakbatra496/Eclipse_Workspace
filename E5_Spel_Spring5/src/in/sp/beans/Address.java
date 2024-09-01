package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addrId")
public class Address 
{
	@Value("222")
	private int houseno;
	
	@Value("Gurugram")
	private String city;

	@Value("34567")
	private int pincode;
	
	public int getHouseno() {
		return houseno;
	}

	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getCity() {
		return city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	
	
	@Override
	public String toString() 
	{
		return "#"+houseno+", "+city+" - "+pincode;
	}
}
