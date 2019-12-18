package com.sathya.admin.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.admin.data.LocationRepository;
import com.sathya.admin.entites.Location;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationRepository locationRepository;

	@Override

	public List<Location> findAll() {
		return (List<Location>) locationRepository.findAll();
	}

	@Transactional
	public Location insertLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {

		return locationRepository.save(location);
	}

	@Transactional
	public void deleteLocation(Object location) {
		locationRepository.deleteById((Integer) location);

	}

}
