package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.User;
import com.app.services.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	// this method return  HTTP status of OK (200) and the message "Registration Successful".
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody User user)
	{
		
		//System.out.println(user);
		userService.register(user);
		return ResponseEntity.ok("Registration Successful");
		
	}
	
	@PostMapping("/login")
	public ResponseEntity<User> login(@RequestParam String email, @RequestParam String passw)
	{
		User user = userService.login(email, passw);
		if(user!=null)
		{
			return ResponseEntity.ok(user);
		}
		else
		{
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id)
	{
		User user = userService.findById(id);
		if(user!=null)
		{
			return ResponseEntity.ok(user);
		}
		else
		{
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping("/byFirstName")
	public ResponseEntity<List<User>> getUsersByFirstName(@RequestParam String fname)
	{
	
			List<User> users = userService.findByFirstName(fname);
			if(users.isEmpty())
			{
				return ResponseEntity.ok(users);
			}
			else
			{
				return ResponseEntity.notFound().build();
			}
	}
	

}
