package com.flipkart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.flipkart.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
	@Query(value="select prod_name,city from flipkart_order join flipkart_product on flipkart_order.order_id=flipkart_product.order_fkey",nativeQuery = true)
	List<Object> getAll();
}
