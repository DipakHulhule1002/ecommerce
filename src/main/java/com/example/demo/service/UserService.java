package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.UserDto;

public interface UserService {
	
	ResponseEntity<Object> addUser(UserDto userDto);

}
