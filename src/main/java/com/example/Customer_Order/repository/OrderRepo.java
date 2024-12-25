package com.example.Customer_Order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Customer_Order.dto.Orders;

public interface OrderRepo extends JpaRepository<Orders, Integer> {

}
