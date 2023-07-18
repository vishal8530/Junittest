package com.junit5example.test1.service;

import java.util.List;

import com.junit5example.test1.entity.Product;

public interface Productservice {
	
	// to add product 
	
	public Product createproduct(Product product);
	
	// to update  the product
	public Product updateproduct(Product product);
	
	//to get all products
	
	public List<Product> getallproducts();
	
	// to get only one product 
     public Product getoneproduct(Integer id);
     
     // to delete product
     public void deleteproduct(Integer id);
     
     // with the given id give the name of the user
     
     public Product givethename( Integer id);
}
