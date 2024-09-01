package com.example.demo.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import com.example.demo.entity.User;

import lombok.Data;

@Data
public class OrderDto {

	private Long id;
	
	private List<ItemDto> items;
	
	private BigDecimal totalAmount;
	
	private LocalDateTime orderDateTime;
	
	private  User user;
	
}
