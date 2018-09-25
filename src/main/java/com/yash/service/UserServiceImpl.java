package com.yash.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.dao.UserRepository;
import com.yash.model.User;
@Service

public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	

	@Override
	public void save(User user) {
		
		userRepository.save(user);
		
	}



	@Override
	public List<User> getListOfUsers() {
		List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users:: add);
       return users;	}

	

}
