package com.example.Customer_Order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.example.Customer_Order.dto.Customer;
import com.example.Customer_Order.repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo repo;

	public String saveCustomer(Customer customer, ModelMap map) {
		repo.save(customer);
		map.put("customer", customer); 
		return "customer.html"; 
	}

}
