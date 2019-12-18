package com.sathya.admin.service;

import com.sathya.admin.entites.Restaurant;

public interface RestaurantService {

	public Restaurant insertRestaurant(Restaurant restaurant);

	public Restaurant updateRestaurant(Restaurant restaurant);

	public void deleteRestaurantById(Integer id);

	public Iterable<Restaurant> getAllRestaurant();

}
