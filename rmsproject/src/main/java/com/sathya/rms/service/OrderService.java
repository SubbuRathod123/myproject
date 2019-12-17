package com.sathya.rms.service;

import java.util.Optional;

import com.sathya.rms.entity.Order;

public interface OrderService {

	public Order insertOrder(Order order);

	public Order updateOrder(Order order);

	public void deleteOrderById(Integer id);

	public Iterable<Order> getAllOrder();

	public Optional<Order> getOrderById(Integer OrderId);

}
