package com.developersguide.junit.suites;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	private List<User> list = new ArrayList<User>();
	
	public User createUser(User user){
		list.add(user);
		return user;
	}
	
	public List<User> getUsers(){
		return this.list;
	}
	
	public void deleteUser(User user){
		list.remove(user);
	}
}
