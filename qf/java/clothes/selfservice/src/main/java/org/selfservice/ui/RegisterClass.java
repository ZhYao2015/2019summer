package org.selfservice.ui;

import org.selfservice.bean.User;
import org.selfservice.service.UserService;
import org.selfservice.service.impl.UserServiceImpl;
import org.selfservice.utils.BusinessException;

public class RegisterClass extends BaseClass {
	
	public void register() throws BusinessException{
		println(getString("input.username"));
		String username=input.nextLine();
		println(getString("input.password"));
		String password=input.nextLine();
		User user=new User(username,password);
		UserService userService=new UserServiceImpl();
		userService.register(user);
	}
}