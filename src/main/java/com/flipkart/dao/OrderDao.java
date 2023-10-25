package com.flipkart.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flipkart.entity.OrderEntity;
import com.flipkart.repository.OrderRepository;

@Repository
public class OrderDao {
@Autowired
OrderRepository or;

public String setOrder(OrderEntity order) {
	or.save(order);
	return "ordered";
}

public String setOrders(List<OrderEntity> orders) {
	or.saveAll(orders);
	return "All ordered";
}

public List<Object> getAll() {
	return or.getAll();
}
}
