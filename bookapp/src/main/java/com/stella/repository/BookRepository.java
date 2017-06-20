package com.stella.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.stella.model.Book;


public interface BookRepository extends JpaRepository<Book,Long> {


	
	
	
}