package com.junit5example.test1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.junit5example.test1.entity.Product;
import com.junit5example.test1.repo.Productrepository;

@DataJpaTest
class Productrepositorytest {
   
	@Autowired
	private TestEntityManager entitymanager;
	
	@Autowired
	private Productrepository productrepository;
	
	
//	@Test
//	@Rollback(false)
//	public void testsavenewproduct() {
//		
//		      entitymanager.persist(new Product("i phone 10",(float) 1099));
//		      
//		      Product product = productrepository.findByName("iPhone");
//		         
//		      
//		      assertThat(product.getName()).isEqualTo("iphone");
//		                
//	}
	
//	@Test
//	@Rollback(false)
//	public void testretrivalproduct() {
//		
//		                 List<Product> findAll = productrepository.findAll();
//		                 assertThat(findAll).size().isGreaterThan(0);
//	}
//	
	@Test
	@Rollback(false)
	public void testFindProductByName(Product id) {
		
		                //  Optional<Product> findById = productrepository.findById(id.getId());
	    Product product = productrepository.findByName("redmi");
	    System.out.println(product);
	    assertThat(product.getName()).isEqualTo("redmi");
	}
	
	
	

}
