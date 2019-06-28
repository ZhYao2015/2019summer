package org.tud.zyao.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.tud.zyao.dao.UserDao;
import org.tud.zyao.domain.User;
import org.tud.zyao.utils.DruidUtils;

public class UserDaoImpl implements UserDao{

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		System.out.println("listing...");
		QueryRunner runner=new QueryRunner(DruidUtils.getDataSource());
		try {
			return runner.query("select * from user;", new BeanListHandler<User>(User.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User findId(int id) {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(DruidUtils.getDataSource());
		try {
			return runner.query("select * from user where id="+Integer.toString(id)+";",
					new BeanHandler<User>(User.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(DruidUtils.getDataSource());
		//unpacking?
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int userId){
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(DruidUtils.getDataSource());
		try {
			runner.update("update user set flag=2 where id="+Integer.toString(userId)+";");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
