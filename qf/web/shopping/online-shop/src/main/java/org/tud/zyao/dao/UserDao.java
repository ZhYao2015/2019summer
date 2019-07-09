package org.tud.zyao.dao;

import java.util.List;

import org.tud.zyao.domain.User;

public interface UserDao {
	
	List<User> findByPage(int pageNum,int pageSize);
	List<User> findAll();
	User findById(int id);
	void add(User user);
	void update(User user);
	void delete(int id);
	
	void activateUser(String email, String code);
	
	User checkUserName(String username);
}
