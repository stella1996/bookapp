package com.stella.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stella.model.Book;
import com.stella.repository.BookRepository;
import com.stella.service.BookService;

@Controller
@RequestMapping("/books")

public class BookController {

	@Autowired
	 BookRepository bookRepo;
	@Autowired
	 BookService bookService;

	@GetMapping("/list")
	
	public String findall(ModelMap modelMap)
	{
		List<Book> findAll = bookService.findAll();
		modelMap.addAttribute("BOOK_SALES", findAll);
		return  "listbook";
	}
	
	@GetMapping("/{id}")
	
	public String view(@PathVariable("id") Long id,ModelMap modelMap,HttpSession session)
	{
		System.out.println("ShowBook:" + id);
		
		Book book =bookService.findOne(id);
		modelMap.addAttribute("BOOK_ORDER", book);

		return "show";
		
	}
	

	
	
	
}
