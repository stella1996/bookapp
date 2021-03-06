package com.stella.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stella.model.Order;
import com.stella.model.OrderItem;
import com.stella.repository.OrderItemRepository;
import com.stella.repository.OrderRepository;
@Service
public class OrderService {

	@Autowired
	private OrderItemRepository orderitemRepo;
	@Autowired
	private OrderRepository orderRepo;


	public void save(Order order) {
		orderRepo.save(order);
		
	}

}
