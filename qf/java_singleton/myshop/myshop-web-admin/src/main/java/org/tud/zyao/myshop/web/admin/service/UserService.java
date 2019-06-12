package org.tud.zyao.myshop.web.admin.service;

import org.tud.zyao.myshop.domain.User;

public interface UserService {
	public User login(String email,String password);
	public void SayHi();
}
