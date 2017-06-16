package com.stella.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stella.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	
	public User findByEmailAndPassword(String email,String password);
	
}