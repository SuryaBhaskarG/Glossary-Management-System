package com.surya.service;

import java.util.List;

import com.surya.model.Cart;
import com.surya.model.Customer;
import com.surya.model.Product;



public interface CartService {

	Cart addCart(Cart cart,long productId,long customerId);
	List<Cart> getAllCarts();
	Cart getCartById(long cartId);
	Cart updateCart(Cart cart, long cartId);
	void deleteCart(long cartId);
	void deleteCartByCustomer(Customer c);
	
	

}