package in.sp.service;
import in.sp.beans.*;

import in.sp.dao.*;
public class StudentServiceImpl implements StudentService {
	@Override
	public boolean addStdDetailsService(Student std) 
	{
		StudentDao stdDao = new StudentDaoImpl();
		boolean status = stdDao.addStdDetails(std);
		return status;
	}
}
