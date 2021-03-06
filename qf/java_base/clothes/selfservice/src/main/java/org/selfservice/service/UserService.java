package org.selfservice.service;

import org.selfservice.bean.User;
import org.selfservice.utils.BusinessException;

public interface UserService {
	
	public User register(User user) throws BusinessException;
	
	public User login(String username,String password) throws BusinessException;
}
