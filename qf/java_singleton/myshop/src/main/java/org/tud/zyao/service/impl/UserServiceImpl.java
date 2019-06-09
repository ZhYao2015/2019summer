package org.tud.zyao.service.impl;

import org.tud.zyao.commons.context.SpringContext;
import org.tud.zyao.dao.UserDao;
import org.tud.zyao.entity.User;
import org.tud.zyao.service.UserService;

public class UserServiceImpl implements UserService{

	
	
	public User login(String email, String password) {
		// TODO Auto-generated method stub
		SpringContext context=new SpringContext();
		UserDao userDao=(UserDao)context.getBean("userDao");
		return userDao.getUser(email, password);
	}

	public void SayHi() {
		// TODO Auto-generated method stub
		System.out.println("Hi!!!!!");
	}

}
