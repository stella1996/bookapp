package com.stella.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stella.model.Book;
import com.stella.model.Order;
import com.stella.model.User;
import com.stella.repository.OrderRepository;

@Controller
@RequestMapping("order")
public class OrderController {
	@Autowired
	 OrderRepository orderRepo;
	@GetMapping("/save")
	public String save(HttpSession session)
	{
		User user  = (User) session.getAttribute("u");

		Integer Total = (Integer) session.getAttribute("totalprice");
	
	
	  
		
		return null;

	}
	

		

	

		
}
