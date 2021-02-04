package com.zlin.jsondb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zlin.jsondb.domain.User;
import com.zlin.jsondb.service.UserService;

@RestController
@RequestMapping("/users")
public class userController {
	private UserService userService;

	public userController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/list")
	public Iterable<User> list(){
		return userService.list();
	}

}
