package com.junit5example.test1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junit5example.test1.entity.Product;
import com.junit5example.test1.repo.Productrepository;

@Service
public class Productserviceimpl implements Productservice {
	
	
	@Autowired
	private Productrepository  repo;

	@Override
	public Product createproduct(Product product) {
		
		 
		  Product productvalue = repo.save(product);
		
		return productvalue;
	}

	@Override
	public Product updateproduct(Product product) {
		
		 
		 Product updatedproduct = repo.save(product);
		
		return updatedproduct;
	}

	@Override
	public List<Product> getallproducts() {
		   
		  List<Product> allproducts = repo.findAll();
		                  
		return allproducts;
	}

	@Override
	public Product getoneproduct(Integer id) {
                       
		    Product productid = repo.findById(id).get();
		return productid;
	}

	@Override
	public void deleteproduct(Integer id) {
		
		repo.deleteById(id);
	}

	@Override
	public Product givethename(Integer id) {
		         Product product = repo.findById(id).get();
		          Product findByName =   repo.findByName(product.getName());
		   
		return findByName;
	}

}
