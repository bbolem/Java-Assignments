package com.example.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.di.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	//Field Based Dependency Injection
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
//	@Autowired
//	public void setUserRepo(UserRepository userRepo) {
//		System.out.println("Setter DI from service");
//		this.userRepo = userRepo;
//	}
	
	public void getUsers() {
		//userRepo.getUsers();
		System.out.println("From UserServiceImpl");

	}

}
