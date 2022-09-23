package com.retrospective.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retrospective.data.dto.LoginDto;
import com.retrospective.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/authentication/api")
public class UserController {

	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/login")
	public boolean checkUserPass(@RequestBody LoginDto loginDto) {
		return userService.checkUserPass(loginDto.getEmail(), loginDto.getPassword());
	}
}
