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
import com.example.demo.service.CategoryService;

@RestController
@RequestMapping("categories")
public class CategoryController {

	private CategoryService categoryService;

	CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@PostMapping
	public ResponseEntity<Object> addCategory(@RequestBody CategoryDto category) {

		return categoryService.addCategory(category);

	}

	@GetMapping
	public ResponseEntity<Object> getAllCategories() {
		return categoryService.getAllCategories();
	}

	@GetMapping("/{categoryId}")
	public ResponseEntity<Object> getCategoryById(@PathVariable Long categoryId) {
		return categoryService.getCategoryById(categoryId);
	}

	@PutMapping("/{categoryId}")
	public ResponseEntity<Object> updateCategory(@RequestBody CategoryDto category, @PathVariable Long categoryId) {
		return categoryService.updateCategory(category, categoryId);
	}

	@DeleteMapping("/{categoryId}")
	public ResponseEntity<Object> disbaleCategory(@PathVariable Long categoryId) {
		return categoryService.disableCategory(categoryId);
	}

}
