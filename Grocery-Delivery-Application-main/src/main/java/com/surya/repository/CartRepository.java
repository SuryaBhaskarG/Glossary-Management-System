package com.surya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surya.model.Cart;
import com.surya.model.Customer;



@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
	
	void deleteCartByCustomer(Customer c);
}