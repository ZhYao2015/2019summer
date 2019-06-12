package org.tud.zyao.myshop.web.admin.dao;

import org.tud.zyao.myshop.domain.User;

public interface UserDao {
	public User getUser(String email,String password);
}
