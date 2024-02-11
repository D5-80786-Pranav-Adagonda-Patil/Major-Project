package com.app.services;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Bookings;
import com.app.entities.Catering;
import com.app.entities.Hotel;
import com.app.entities.User;
import com.app.repository.AdminRepo;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepo adminRepo;

	@Override
	public User addUser(@Valid User user) {
		
		return adminRepo.saveUser(user);
	}

	@Override
	public User updateUser(@Valid User user) {
		
		return adminRepo.updateUser(user);
	}

	@Override
	public void deleteUser(Long userId) {
		adminRepo.deleteById(userId);
		
	}

	@Override
	public List<Bookings> getUserBookings(Long userId) {
	
		return adminRepo.findBookingsByUserId(userId);
	}

	@Override
	public List<Hotel> getAllHotels() {
		
		return adminRepo.findAllHotels();
	}

	@Override
	public List<Catering> getAllCaterings() {
		
		return adminRepo.findAllCaterings();
	}

}
