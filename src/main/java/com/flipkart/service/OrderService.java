package com.flipkart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.dao.OrderDao;
import com.flipkart.entity.OrderEntity;

@Service
public class OrderService {
@Autowired
OrderDao od;

public String setOrder(OrderEntity order) {
	return od.setOrder(order);
}

public String setOrders(List<OrderEntity> orders) {
	return od.setOrders(orders);
}

public List<Object> getAll() {
	return od.getAll();
}
}
