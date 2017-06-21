package com.stella.model;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@Column(name="total_price")
	private Integer total_price;
	
	@Column(name="ordered_date")
	private LocalDateTime ordered_date;
	
	@Column(name="cancelled_date")
	private LocalDate cancelled_date;
	
	
	@Column(name="modified_date")
	private LocalDate modified_date;
	
	@Column(name="delivered_date")
	private LocalDate delivered_date;
	
	@Column(name="status")
	private String status;
	
	@Column(name="reason")
	private String reason;

	@Override
	public String toString() {
		return "Order [id=" + id + ", user=" + user + ", total_price=" + total_price + ", ordered_date=" + ordered_date
				+ ", cancelled_date=" + cancelled_date + ", modified_date=" + modified_date + ", delivered_date="
				+ delivered_date + ", status=" + status + ", reason=" + reason + "]";
	}
	
	

}
