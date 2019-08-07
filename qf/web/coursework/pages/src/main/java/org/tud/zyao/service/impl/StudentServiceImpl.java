package org.tud.zyao.service.impl;

import java.util.List;

import org.tud.zyao.dao.StudentDao;
import org.tud.zyao.dao.impl.StudentDaoImpl;
import org.tud.zyao.domain.PageBean;
import org.tud.zyao.domain.Student;
import org.tud.zyao.service.StudentService;

public class StudentServiceImpl implements StudentService{

	private StudentDao studentDao=new StudentDaoImpl();
	
	@Override
	public PageBean findByPage(int pageNum, int pageSize) {
		
		List<Student> data=studentDao.findByPage(pageNum, pageSize);
	
		long totalCount=studentDao.getCount();
		
		PageBean pageBean=new PageBean(pageNum,pageSize,totalCount,data);
		
		return pageBean;

	}

}
