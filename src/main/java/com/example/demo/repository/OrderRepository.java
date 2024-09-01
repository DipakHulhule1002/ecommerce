package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Order;
import com.example.demo.entity.User;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
	List<Order> findByStatus(Character status);
	Optional<Order>  findByIdAndStatus(Long id, Character status);
	
	List<Order> findByUserAndStatus(User user, Character status);

}
