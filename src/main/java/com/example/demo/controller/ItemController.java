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

import com.example.demo.dto.CategoryDto;
import com.example.demo.dto.ItemDto;
import com.example.demo.service.ItemService;

@RestController
@RequestMapping("items")
public class ItemController {

	private ItemService itemService;

	public ItemController(ItemService itemService) {
		this.itemService = itemService;

	}

	@PostMapping
	public ResponseEntity<Object> addItem(@RequestBody ItemDto item) {

		return itemService.addItem(item);

	}

	@GetMapping
	public ResponseEntity<Object> getAllItems() {
		return itemService.getAllItems();
	}

	@GetMapping("/{itemId}")
	public ResponseEntity<Object> getItemById(@PathVariable Long itemId) {
		return itemService.getItemById(itemId);
	}

	@PutMapping("/{itemId}")
	public ResponseEntity<Object> updateItem(@RequestBody ItemDto item,@PathVariable Long itemId) {
		return itemService.updateItem(item,itemId);
	}

	@DeleteMapping("/{itemId}")
	public ResponseEntity<Object> disableItem(@PathVariable Long itemId) {
		return itemService.disableItem(itemId);
	}

}
