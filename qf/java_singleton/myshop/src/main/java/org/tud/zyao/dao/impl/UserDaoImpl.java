package org.tud.zyao.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tud.zyao.dao.UserDao;
import org.tud.zyao.entity.User;

public class UserDaoImpl implements UserDao{

	private static final Logger logger=LoggerFactory.getLogger(UserDaoImpl.class);
	
	public User getUser(String email, String password) {
		// TODO Auto-generated method stub
		logger.debug("invoke getUser(),email:{} password:{}",email,password);
		
		User user=null;
		
		if("zyao2015inf@gmail.com".equals(email)){
			if("admin".equals(password)){
				user =new User();
				user.setEmail("zyao2015inf@gmail.com");
				user.setUsername("zyao");
				
				logger.info("get {} info",user.getUsername());
			}
		}else{
			logger.warn("get user with email {} info failed",email);
		}
		
		return user;
	}
	
}
