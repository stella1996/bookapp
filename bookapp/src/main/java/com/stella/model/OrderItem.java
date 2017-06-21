package com.stella.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name="order_items")
public class OrderItem {
	@Id
    @GeneratedValue
	@Column(name="id")
	private Long id;
    
    
    @ManyToOne
	@JoinColumn(name="order_id")
	private Order order;
    
    
	@ManyToOne
	@JoinColumn(name="book_id")
	private Book book;
    
    @Column(name="quantity")
	private Integer quantity;
    
	@Column(name="ordered_date")
	private LocalDateTime ordered_date;
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", order=" + order + ", book=" + book + ", quantity=" + quantity
				+ ", ordered_date=" + ordered_date + "]";
	}

	
	
}
