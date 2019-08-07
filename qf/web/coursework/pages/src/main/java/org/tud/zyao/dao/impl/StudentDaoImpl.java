package org.tud.zyao.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.tud.zyao.dao.StudentDao;
import org.tud.zyao.domain.Student;
import org.tud.zyao.utils.DruidUtils;

public class StudentDaoImpl implements StudentDao{

	QueryRunner qr=new QueryRunner(DruidUtils.getDataSource());
	
	public List<Student> findByPage(int pageNum, int pageSize) {
		List<Student> list=null;
		try {
			list = qr.query("select * from student limit ?,?",new BeanListHandler<Student>(Student.class),
			(pageNum-1)*pageSize,pageSize);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("paging failed");
		}
		
		return list;
	}


	public long getCount() {
		Long count=0L;
		try {
			count=qr.query("select count(*) from student", new ScalarHandler<Long>());
		} catch (SQLException e) {
			throw new RuntimeException("counting results failed.");
		}
		return count;
	}


	@Override
	public void add(Student s) {
		// TODO Auto-generated method stub
		try {
			qr.update("insert into student values(?,?,?,?,?)",s.getStudentNo(),s.getLoginPwd(),s.getStudentName(),
					s.getSex(),s.getBornDate());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Inserting failed");
		}
	}

}
