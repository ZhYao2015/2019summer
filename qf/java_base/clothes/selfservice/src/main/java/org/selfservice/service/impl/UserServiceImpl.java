package org.selfservice.service.impl;

import org.selfservice.bean.User;
import org.selfservice.service.UserService;
import org.selfservice.utils.BusinessException;
import org.selfservice.utils.EmptyUtils;
import org.selfservice.utils.UserIO;

public class UserServiceImpl implements UserService{

	@Override
	public User register(User user) throws BusinessException {
		// TODO Auto-generated method stub
		UserIO userIO=new UserIO();
		userIO.addUser(user);
		userIO.writeUsers();
		return user;
	}

	@Override
	public User login(String username,String password) throws BusinessException {
		// TODO Auto-generated method stub
		if(EmptyUtils.isEmpty(username)){
			throw new BusinessException("username.notnull");
		}
		if(EmptyUtils.isEmpty(password)){
			throw new BusinessException("password.notnull");
		}
		
		UserIO userIO=new UserIO();
		User user=userIO.findByUsernameAndPassword(username, password);
		return user;
	}

	
}
