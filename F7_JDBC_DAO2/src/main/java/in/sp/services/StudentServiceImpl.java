package in.sp.services;

import in.sp.beans.Student;
import in.sp.dao.StudentDao;

public class StudentServiceImpl implements StudentService
{
	private StudentDao stdDao;
	public void setStdDao(StudentDao stdDao) 
	{
		this.stdDao = stdDao;
	}

	@Override
	public boolean addStdDetailsService(Student std) 
	{
		boolean status = stdDao.addStdDetailsDao(std);
		System.out.println("Status in services is "+status);

		return status;
	}
}

