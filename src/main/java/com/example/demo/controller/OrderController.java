package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.OrderDto;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping("orders")
public class OrderController {

	private OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@PostMapping("/{userId}")
	public ResponseEntity<Object> createOrder(@PathVariable Long userId) {
		return orderService.createOrder(userId);
	}

	@GetMapping
	public ResponseEntity<Object> getAllOrders() {
		return orderService.getAllOrders();

	}

	@GetMapping("/{orderId}")
	public ResponseEntity<Object> getOrderById(@PathVariable Long orderId) {
		return orderService.getOrderById(orderId);
	}

	@PutMapping("/{orderId}")
	public ResponseEntity<Object> updateOrder(@PathVariable Long orderId, @RequestBody OrderDto orderDetails) {
		return orderService.updateOrder(orderId, orderDetails);

	}

	@DeleteMapping("/{orderId}")
	public ResponseEntity<Object> cancelOrder(@PathVariable Long orderId) {
		ResponseEntity<Object> response = orderService.cancelOrder(orderId);
		return response;
	}

	@GetMapping("/user/{userId}")
	public ResponseEntity<Object> getAllOrdersByUserId(@PathVariable Long userId) {
		ResponseEntity<Object> response = orderService.getAllOrdersByUserId(userId);
		return response;
	}
}
