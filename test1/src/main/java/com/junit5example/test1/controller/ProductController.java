package com.junit5example.test1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junit5example.test1.entity.Product;
import com.junit5example.test1.service.Productservice;

@RestController
@RequestMapping("/")
public class ProductController {
	
	@Autowired
	private Productservice ser;
	@PostMapping("addusers")
	public Product addproduct(@RequestBody Product product) {
		
		 Product createproduct = ser.createproduct(product);    
		return createproduct;
	}
	@PutMapping("updateusers")
	public Product updateproduct(Product product) {
		 Product updateproduct = ser.updateproduct(product);
		return updateproduct;
	}
	
	@GetMapping("allusers")
	public List<Product> getallusers(){
		
		return ser.getallproducts();
	}
	@GetMapping("getone{id}")
	public Product getoneuser( @PathVariable Integer id) {
		Product getoneproduct = ser.getoneproduct(id);
		
		return getoneproduct;
	}
	
	@DeleteMapping("id")
	public void deleteone(@PathVariable  Integer id) {
		  
		ser.deleteproduct(id);
		
	}
	
	@GetMapping("nameofcustomer{id}")
	public Product givethename( @PathVariable Integer id) {
		
		Product givethename = ser.givethename(id);
		
		return givethename;
	}
	

}
