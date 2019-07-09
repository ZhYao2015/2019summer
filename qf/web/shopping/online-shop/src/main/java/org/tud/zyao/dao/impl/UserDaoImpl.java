package org.tud.zyao.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.tud.zyao.dao.UserDao;
import org.tud.zyao.domain.User;
import org.tud.zyao.utils.DruidUtils;

public class UserDaoImpl implements UserDao{

	QueryRunner qr=new QueryRunner(DruidUtils.getDataSource());
	
	@Override
	public List<User> findByPage(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(User user) {
		Object params[]= {user.getUsername(),user.getPassword(),user.getEmail(),user.getGender(),
				user.getFlag(),user.getRole(),user.getCode()};
		try {
			qr.update("insert into tb_user values(?,?,?,?,?,?,?)",params);
		} catch (SQLException e) {
			throw new RuntimeException("UserDaoImpl: Inserting new user failed");
		}
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User checkUserName(String username) {

		User user=null;
		try {
			user=qr.query("select * from tb_user where username=?", new BeanHandler<User>(User.class),username);
		} catch (SQLException e) {
			throw new RuntimeException("UserDaoImpl: Quering with username failed");
		}
		return user;
	}

	@Override
	public void activateUser(String email, String code) {
		try {
			qr.update("update tb_user set flag=1 where email=? and code=?",email,code);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
