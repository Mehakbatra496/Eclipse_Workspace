package FactoryFolder;
import MyBeanFolder.Student;



public class Factory_Class_Method {
	public static Student createStdObj()
	{
		System.out.println("static factory method invoked");
		Student std = new Student(10);
		std.setName("Mehak");
		std.setRollno(214009);
		return std;
	}
}
