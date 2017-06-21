package com.stella.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.stella.model.User;

import com.stella.repository.UserRepository;
@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	
	public String save(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("password") String password) throws Exception {
		User user=new User();
		user.setEmail(email);
		user.setName(name);
        user.setPassword(password);
		System.out.println("New User Detail  " + user);
		userRepo.save(user);
		
		return "welcome";
	}
	
	
	

}
