package com.stella.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stella.model.Book;

@Controller
@RequestMapping("orderItems")
public class OrderItemController {

	@PostMapping("/addToCart")
	public String addtocart(@RequestParam("qty") Integer quantity, HttpSession session, ModelMap modelMap) {
		Book book = (Book) session.getAttribute("book");
		int Price = book.getPrice();
		Integer qunty = (Integer) quantity;
		Integer totalamount = quantity * Price;
		session.setAttribute("totalprice",totalamount);

		modelMap.addAttribute("TOTAL_AMOUNT", totalamount);
		return "addtocart";

	}

}
