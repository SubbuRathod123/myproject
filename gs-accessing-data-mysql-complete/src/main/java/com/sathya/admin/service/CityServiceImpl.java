package com.sathya.admin.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.admin.data.CityRepository;
import com.sathya.admin.entites.City;

@Service
public class CityServiceImpl implements CityService {
	@Autowired
	CityRepository cityRepository;

	public List<City> findAll() {
		return (List<City>) cityRepository.findAll();

	}

	@Transactional
	public City insertCity(City city) {
		return cityRepository.save(city);
	}

	@Transactional
	public City updateCity(City city) {
		return cityRepository.save(city);

	}

	@Transactional
	public void deleteCity(Integer id) {
		cityRepository.deleteById(id);

	}

}
