package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CartService;

@RestController
@RequestMapping("cart")
public class CartController {

	private CartService cartService;

	public CartController(CartService cartService) {
		this.cartService = cartService;
	}

	@PostMapping("/{userId}/{itemId}")
	public ResponseEntity<Object> addItemToCart(@PathVariable Long userId, @PathVariable Long itemId) {
		return cartService.addItemToCart(userId, itemId);
	}

	@DeleteMapping("{userId}/{itemId}")
	public ResponseEntity<Object> removeItemFromCart(@PathVariable Long userId, @PathVariable Long itemId) {
		return cartService.removeItemFromCart(userId, itemId);
	}

	@DeleteMapping("/{userId}")
	public ResponseEntity<Object> removeAllItemsFromCart(@PathVariable Long userId) {
		return cartService.removeAllItemsFromCart(userId);
	}

	@GetMapping("/{userId}")
	public ResponseEntity<Object> getCart(@PathVariable Long userId) {
		return cartService.getCart(userId);
	}
}
