package org.tud.zyao.service.impl;

import org.tud.zyao.dao.UserDao;
import org.tud.zyao.dao.impl.UserDaoImpl;
import org.tud.zyao.domain.User;
import org.tud.zyao.service.UserService;

public class UserServiceImpl implements UserService{

	UserDao userDao=new UserDaoImpl();
	
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);
	}

	@Override
	public boolean checkUserName(String username) {
		// TODO Auto-generated method stub
		return userDao.checkUserName(username)==null?false:true;
	}

	@Override
	public void activateUser(String email, String code) {
		//decode
		//--------
		
		userDao.activateUser(email, code);
	}

}
