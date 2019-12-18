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

import com.sathya.admin.entites.Location;
import com.sathya.admin.service.LocationService;

@RequestMapping("/Locations")
@RestController
public class LocationController {
	@Autowired

	LocationService locationService;

	@GetMapping("/getAllLocatons")
	public List<Location> getAllLocation() {
		return locationService.findAll();

	}

	@PostMapping("/addLocation")
	public Location insertLocation(@RequestBody Location location) {
		System.out.println(" "+location.getId()+"  "+location.getLocId()+""+location.getLocName());
		return locationService.insertLocation(location);
	}

	@PutMapping("/updateLocation")
	public Location updateLocation(@RequestBody Location location) {
		return locationService.updateLocation(location);

	}

	@DeleteMapping("/deleteLocatin/{id}")
	public void deleteLocation(@PathVariable("id") Integer id) {
		locationService.deleteLocation(id);
	}
}
