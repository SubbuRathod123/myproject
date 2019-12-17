package com.sathya.rms.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{

	
	public Optional<Order> findByRoleId(Integer roleId);
}
