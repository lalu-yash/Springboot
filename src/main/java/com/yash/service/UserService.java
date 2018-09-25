package com.yash.service;

import java.util.List;

import com.yash.model.User;

public interface UserService {
	
	
	void save(User user);
	
	List<User> getListOfUsers();
	
	

}
