package com.stella.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stella.model.Book;
import com.stella.repository.BookRepository;


@Service
public class BookService {
    @Autowired
	private BookRepository bookRepo;
	public List<Book> findAll(){
		return bookRepo.findAll();
	}
}


	
	
	

