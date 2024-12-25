package com.example.Customer_Order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Customer_Order.dto.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	void save(String cname); 
 
}
