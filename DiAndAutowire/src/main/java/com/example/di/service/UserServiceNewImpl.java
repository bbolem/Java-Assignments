package com.example.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.di.repository.UserRepository;

@Service
public class UserServiceNewImpl implements UserService{
	
	@Autowired
	UserRepository userRepo;
	
	public void getUsers() {
		System.out.println("From UserServiceNewImpl");
	}
	
}
