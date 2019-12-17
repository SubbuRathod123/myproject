package com.sathya.rms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.entity.Order;
import com.sathya.rms.repository.OrderRepository;

@Service
public class OrderServiveImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order insertOrder(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public Order updateOrder(Order order) {

		return orderRepository.save(order);
	}

	@Override
	public void deleteOrderById(Integer id) {
		orderRepository.deleteById(id);

	}

	@Override
	public Iterable<Order> getAllOrder() {
		return orderRepository.findAll();
	}

	@Override
	public Optional<Order> getOrderById(Integer orderId) {
		return orderRepository.findById(orderId);
	}

}
