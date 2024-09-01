package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import com.example.demo.dto.OrderDto;


public interface OrderService {

	ResponseEntity<Object> createOrder(Long userId);
	ResponseEntity<Object> getAllOrders();
	ResponseEntity<Object> getOrderById(Long orderId);
	ResponseEntity<Object> updateOrder(Long orderId, OrderDto orderDetails);
	ResponseEntity<Object> cancelOrder(Long orderId);
	ResponseEntity<Object> getAllOrdersByUserId(Long userId);
}
