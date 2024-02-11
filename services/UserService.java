package com.app.services;

import java.util.List;

import com.app.entities.User;

public interface UserService {
	
	User register(User user);
	
	User login (String email,String password);
	
	User findById(Long userId);
	
	List<User> findByFirstName(String name);

}
