package org.tud.zyao.test;

import java.util.Date;

import org.tud.zyao.dao.StudentDao;
import org.tud.zyao.dao.impl.StudentDaoImpl;
import org.tud.zyao.domain.Student;

public class TestStudent {
	public static void main(String[] args) {
		StudentDao studentDao=new StudentDaoImpl();
		for(int i=0;i<100;i++) {
			Student s=new Student(i,i+100+"","maki "+i,"F",new Date());
			studentDao.add(s);
		}
	}
}
