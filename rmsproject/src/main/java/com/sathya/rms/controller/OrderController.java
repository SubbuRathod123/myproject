package com.sathya.rms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entity.Order;
import com.sathya.rms.service.OrderService;

@RequestMapping(path = "/Order")
@RestController
public class OrderController {
	@Autowired
	OrderService orderService;

	@PostMapping("/insertOrder")
	public Order InsertOrder(@RequestBody Order order) {
		return orderService.insertOrder(order);
	}

	@PutMapping("/updateOrder")
	public Order updateOrder(@RequestBody Order order) {
		return orderService.updateOrder(order);
	}

	@DeleteMapping("/deleteOrder/{id}")
	public void deleteOrderById(@PathVariable("id") Integer id) {
		orderService.deleteOrderById(id);
	}

	@GetMapping("/getAllOrder")
	public Iterable<Order> getAllOrder() {
		return orderService.getAllOrder();

	}

	@GetMapping("/getOrder/{id}")
	public Optional<Order> getOrderById(@PathVariable("id") Integer id) {
		return orderService.getOrderById(id);
	}
}
