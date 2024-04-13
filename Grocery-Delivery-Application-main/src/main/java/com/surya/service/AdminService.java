package com.surya.service;

import java.util.List;

import com.surya.model.Admin;
import com.surya.model.Customer;
import com.surya.model.Product;

public interface AdminService {
	Admin saveAdmin(Admin admin);
	Admin loginAdmin(Admin admin);
	
	public List<Product> getAllProducts(long adminId);
	public List<Customer> getAllCustomers(long adminId);
}