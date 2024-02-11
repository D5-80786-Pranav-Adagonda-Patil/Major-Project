package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.User;
import com.app.repository.UserRepo;
import com.app.services.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public User register(User user) {

		return userRepo.save(user);
	}

	@Override
	public User login(String email, String password) {
		
		User user = userRepo.findByEmail(email);
		if(user!=null && user.getPassword().equals(password))
		{
			return user;
		}
		return null; // "Invaild Username or Password"
	}

	@Override
	public User findById(Long userId) {
		
		return userRepo.findById(userId).orElseThrow();
	}

	@Override
	public List<User> findByFirstName(String name) {
	
		return userRepo.findByfirstName(name);
	}

}
