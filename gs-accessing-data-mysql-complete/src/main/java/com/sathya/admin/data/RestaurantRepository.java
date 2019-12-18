package com.sathya.admin.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.admin.entites.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {

}
