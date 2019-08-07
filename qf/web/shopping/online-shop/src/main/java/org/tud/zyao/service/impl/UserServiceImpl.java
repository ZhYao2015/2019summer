package org.tud.zyao.service.impl;

import org.tud.zyao.dao.UserDao;
import org.tud.zyao.dao.impl.UserDaoImpl;
import org.tud.zyao.domain.User;
import org.tud.zyao.exception.UserException;
import org.tud.zyao.service.UserService;
import org.tud.zyao.utils.Md5Utils;

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

	@Override
	public User login(String username, String password) {
		// don't forget the encryption
		password=Md5Utils.md5(password);
		User user=userDao.login(username, password);
//		if(user.getFlag()==0) {
//			throw new UserException("not activated!");
//		}
		return user;
	}

}
