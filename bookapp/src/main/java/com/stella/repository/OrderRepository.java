package com.stella.repository;







import org.springframework.data.jpa.repository.JpaRepository;

import com.stella.model.Book;
import com.stella.model.Order;


public interface OrderRepository extends JpaRepository<Order,Long> {



	
	
}