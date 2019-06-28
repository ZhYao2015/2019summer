package org.tud.zyao.dao;

import java.util.List;

import org.tud.zyao.domain.User;

public interface UserDao {
	List<User> findAll();
	User findId(int id);
	
	void add(User user);
	void delete(int userId);
	void update(User user);
	
	
	
}
