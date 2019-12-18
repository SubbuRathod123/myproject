package com.sathya.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sathya.admin.entites.City;

@Service

public interface CityService {

	public List<City> findAll();

	public City insertCity(City city);

	public City updateCity(City city);

	public void deleteCity(Integer id);

}
