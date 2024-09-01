package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import com.example.demo.dto.ItemDto;

public interface ItemService {
	
	ResponseEntity<Object> addItem(ItemDto item);

	ResponseEntity<Object> getAllItems();

	ResponseEntity<Object> getItemById(Long itemId);

	ResponseEntity<Object> updateItem(ItemDto item,Long itemId);

	ResponseEntity<Object> disableItem(Long itemId);
}
