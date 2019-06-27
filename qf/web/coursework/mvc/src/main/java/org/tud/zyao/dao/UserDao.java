package org.tud.zyao.dao;

import java.util.List;

import org.tud.zyao.domain.User;

public interface UserDao {
	List<User> findAll();
	User findId(int id);
	
	void add(User user);
	void update(User user);
	void delete(User user);
	
	
	
}
