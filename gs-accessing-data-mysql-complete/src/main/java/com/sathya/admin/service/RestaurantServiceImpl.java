package com.sathya.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.admin.data.RestaurantRepository;
import com.sathya.admin.entites.Restaurant;

@Service

public class RestaurantServiceImpl implements RestaurantService {
	@Autowired
	RestaurantRepository restaurantRepository;

	@Override
	public Restaurant insertRestaurant(Restaurant restaurant) {

		return restaurantRepository.save(restaurant);
	}

	@Override
	public Restaurant updateRestaurant(Restaurant restaurant) {

		return restaurantRepository.save(restaurant);
	}

	@Override
	public void deleteRestaurantById(Integer id) {
		restaurantRepository.deleteById(id);

	}

	@Override
	public Iterable<Restaurant> getAllRestaurant() {
		return restaurantRepository.findAll();
	}

}
