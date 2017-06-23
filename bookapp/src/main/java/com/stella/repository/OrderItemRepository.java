package com.stella.repository;







import org.springframework.data.jpa.repository.JpaRepository;



import com.stella.model.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {



	
	
}