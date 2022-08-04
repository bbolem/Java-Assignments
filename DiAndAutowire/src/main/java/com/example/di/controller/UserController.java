package com.example.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.di.service.UserService;

//@Controller
@RestController
public class UserController {
	
	
	
	//Autowire By Type
	@Autowired
	@Qualifier("UserServiceNewImpl")	//Autowire By Qualifier
	UserService userServiceNewImpl;
	//UserService userServiceImpl; 
	
	
//	//Field Based Dependency Injection
//	UserService userService;
//	
//	//Constructor Based Dependency Injection
//	@Autowired
//	public UserController(UserService userService) {
//		System.out.println("Constructor DI");
//		this.userService = userService;
//	}
//	
//	//Setter Based Dependency Injection
//	@Autowired
//	public void setUserService(UserService userService) {
//		System.out.println("Setter DI");
//		this.userService = userService;
//	}
	
	@GetMapping("/test")
	public void getUsers() {
		//userService.getUsers();
		//userServiceImpl.getUsers();
		userServiceNewImpl.getUsers();
	}

}
