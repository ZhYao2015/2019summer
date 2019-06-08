package org.selfservice.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.selfservice.bean.User;

public class UserIO {

	private static List<User> users=new ArrayList<>();
	private static final String USER_FILE="user.obj";
	
	
	//write to users list
	public boolean writeUsers() throws BusinessException{
			try{
				ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(USER_FILE));
				out.writeObject(users);
				out.close();
				return true;
			} catch (IOException e) {
				throw new BusinessException("io.write.error");
			}
			
	}
	
	public boolean readUsers() throws BusinessException{
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream(USER_FILE));
			users=(List<User>)in.readObject();
			in.close();
			return true;
		} catch (IOException | ClassNotFoundException e) {
			throw new BusinessException("io.read.error");
		}
	}
	
	public void addUser(User user){
		user.setId(users.size()+1);
		users.add(user);
	}
	
	public User findByUsernameAndPassword(String username, String password){
		for (User user:users){
			if(user.getUsername().equals(username)&&
					user.getPassword().equals(password)){
				return user;
			}
		}
		return null;
	}
	
	
}
