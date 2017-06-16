package com.stella.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stella.model.User;
import com.stella.repository.UserRepository;

@Controller
@RequestMapping("/users")

public class UserController {

	@Autowired
	private UserRepository userRepo;

	@PostMapping("/save")
	public String save(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("password") String password) {
		User user=new User();
		user.setEmail(email);
		user.setName(name);
        user.setPassword(password);
		System.out.println("New User Detail  " + user);
		userRepo.save(user);

		return "welcome";
	}

}
