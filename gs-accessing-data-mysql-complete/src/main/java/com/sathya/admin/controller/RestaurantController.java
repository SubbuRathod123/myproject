package com.sathya.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.admin.entites.Restaurant;
import com.sathya.admin.service.RestaurantService;

@RequestMapping("/Restaurant")
@RestController
public class RestaurantController {
	@Autowired
	RestaurantService restaurantService;

	@PostMapping("/insertrestaurant")
	public Restaurant insertRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantService.insertRestaurant(restaurant);
	}

	@PutMapping("/updateRestaurant")
	public Restaurant updateRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantService.updateRestaurant(restaurant);
	}

	@DeleteMapping("/deleteRestaurant")
	public void deleteRestaurantById(Integer id) {
		restaurantService.deleteRestaurantById(id);
	}

	@GetMapping("getAllRestaurant")
	public Iterable<Restaurant> getAllRestaurant() {
		return restaurantService.getAllRestaurant();
	}
}
