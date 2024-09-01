package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Cart;
import com.example.demo.entity.CartItem;
import com.example.demo.entity.Item;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

	List<CartItem> findByCartAndStatus(Cart cart,Character status);

	Optional<CartItem> findByCartAndItemAndStatus(Cart cart, Item item, Character status);

}
