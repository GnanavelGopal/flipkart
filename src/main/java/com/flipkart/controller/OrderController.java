package com.flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.entity.OrderEntity;
import com.flipkart.service.OrderService;

@RestController
public class OrderController {
@Autowired
OrderService os;
	@PostMapping(value="/setOrder")
	public String setOrder(@RequestBody OrderEntity order) {
		return os.setOrder(order);
	}
	@PostMapping(value="/setOrders")
	public String setOrders(@RequestBody List<OrderEntity> orders) {
		return os.setOrders(orders);
	}
	@GetMapping(value="/getAllOrder")
	public List<Object> getAll() {
		return os.getAll();
	}
}
