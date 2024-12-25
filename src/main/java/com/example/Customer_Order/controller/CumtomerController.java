package com.example.Customer_Order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Customer_Order.dto.Customer;
import com.example.Customer_Order.service.CustomerService;


@Controller
public class CumtomerController {
	
	@Autowired
	CustomerService service;

	@GetMapping("/")
	public String homePage() {
		return "welcome.html";
	}
	
	@GetMapping("/customers")
	public String customerPage() {
		return "customer.html"; 
	}
	
	@PostMapping("/customers")
	public String customeradd(@ModelAttribute Customer customer,ModelMap map) {
		return service.saveCustomer(customer,map);    
	}
}
