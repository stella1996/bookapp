package com.stella.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stella.model.User;
import com.stella.repository.UserRepository;

@Controller
@RequestMapping("/users")

public class UserController {

	@Autowired
	 UserRepository userRepo;

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
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	
	@PostMapping("/validate")
	
	public String findByEmailAndPassword(User user)
	{
		
 if(user!=null)
 {
	 System.out.println("valid user");
	 return "book";
 }
 else
 {
	 System.out.println("invalid user");
	 return "display";
 }

		
}
}
