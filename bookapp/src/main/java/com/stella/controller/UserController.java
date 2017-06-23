package com.stella.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stella.model.User;
import com.stella.repository.UserRepository;
import com.stella.service.UserService;

@Controller
@RequestMapping("/users")

public class UserController {

	@Autowired
	UserRepository userRepo;
	@Autowired
	UserService userService;
	

	@PostMapping("/save")
	public String save(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("password") String password) throws Exception {

		return userService.save(name, email, password);

	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/validate")

	public String findByEmailAndPassword(@RequestParam("email") String email,
			@RequestParam("password") String password ,HttpSession session) {
		User user = userRepo.findByEmailAndPassword(email, password);

		if (user != null) {
			System.out.println("valid user");
			session.setAttribute("user",user);
			return "book";
		} else {
			System.out.println("invalid user");
			return "register";
		}

	}
}
