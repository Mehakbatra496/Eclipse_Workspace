package in.sp.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile
{
	@Bean
	public Address addrId()
	{
		Address addr = new Address();
		
		addr.setHouseno(111);
		addr.setCity("Pune");
		addr.setPincode(67890);
		
		return addr;
	}
	
	@Bean
	public Student stdId(@Value("#{addrId.getCity()}") String city)
	{
		Student std = new Student();
		
		std.setName("Avinash");
		//std.setCity(addrId().getCity());
		std.setCity(city);
		
		return std;
	}
}