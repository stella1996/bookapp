package com.stella.repository;







import org.springframework.data.jpa.repository.JpaRepository;

import com.stella.model.Book;


public interface OrderRepository extends JpaRepository<Book,Long> {



	
	
}