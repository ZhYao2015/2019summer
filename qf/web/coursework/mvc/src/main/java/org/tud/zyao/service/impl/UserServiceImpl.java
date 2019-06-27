package org.tud.zyao.service.impl;

import java.util.List;

import org.tud.zyao.dao.UserDao;
import org.tud.zyao.dao.impl.UserDaoImpl;
import org.tud.zyao.domain.User;
import org.tud.zyao.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao userDao=new UserDaoImpl();
	
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public User findId(int id) {
		// TODO Auto-generated method stub
		return userDao.findId(id);
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		userDao.delete(user);
	}

}
