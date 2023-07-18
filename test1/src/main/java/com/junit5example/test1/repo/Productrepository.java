package com.junit5example.test1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junit5example.test1.entity.Product;

public interface Productrepository extends JpaRepository<Product, Integer> {
	
 
	public Product findByName(String name);

}
