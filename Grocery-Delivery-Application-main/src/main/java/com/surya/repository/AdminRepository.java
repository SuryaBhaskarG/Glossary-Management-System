package com.surya.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.model.Admin;



public interface AdminRepository extends JpaRepository<Admin,Long> {
	
	Optional<Admin> findByAdminEmailIdAndAdminPassword(String emailId,String password);
}