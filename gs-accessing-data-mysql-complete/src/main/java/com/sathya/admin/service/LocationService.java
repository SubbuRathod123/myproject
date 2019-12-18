package com.sathya.admin.service;

import java.util.List;

import com.sathya.admin.entites.Location;

public interface LocationService {

	List<Location> findAll();

	Location insertLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Object location);
	
	
	

	
	
	

}
