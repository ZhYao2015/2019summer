package org.tud.zyao.service;

import org.tud.zyao.domain.User;

public interface UserService {
	public void add(User user);
	public boolean checkUserName(String username);
	public void activateUser(String email,String code);
}
