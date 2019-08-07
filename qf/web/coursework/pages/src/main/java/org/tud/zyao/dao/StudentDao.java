package org.tud.zyao.dao;

import java.util.List;

import org.tud.zyao.domain.Student;

public interface StudentDao {
	List<Student> findByPage(int pageNum,int pageSize);
	
	/**
	 * Get the length of the retrieved data.
	 * @return
	 */
	long getCount();
	void add(Student s);
}
