package com.app.services;

import java.util.List;

import com.app.entities.Bookings;
import com.app.entities.Catering;
import com.app.entities.Hotel;
import com.app.entities.User;

public interface AdminService {
	
	User addUser(User user);

    User updateUser(User user);

    void deleteUser(Long userId);

    List<Bookings> getUserBookings(Long userId);

    List<Hotel> getAllHotels();

    List<Catering> getAllCaterings();

}
