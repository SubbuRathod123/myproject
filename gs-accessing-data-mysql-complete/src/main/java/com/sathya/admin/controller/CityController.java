
package com.sathya.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.admin.entites.City;
import com.sathya.admin.service.CityService;

@RequestMapping("/Cities")
@RestController

public class CityController {
	@Autowired
	CityService cityService;

	@GetMapping("/getAllCities")
	public List<City> getAllCities() {
		return cityService.findAll();

	}

	@PostMapping("/addCities")
	public City insertCity(@RequestBody City city) {
		return cityService.insertCity(city);

	}

	@PutMapping("/updateCities")
	public City updateCity(@RequestBody City city) {
		return cityService.updateCity(city);

	}

	@DeleteMapping("/deteleCity/{id}")
	public void deteleCity(@PathVariable("id") Integer id) {
		cityService.deleteCity(id);

	}
	
	

}
