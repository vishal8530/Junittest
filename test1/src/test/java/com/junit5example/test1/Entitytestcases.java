package com.junit5example.test1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import com.junit5example.test1.entity.Product;
import com.junit5example.test1.repo.Productrepository;
@WebMvcTest
class Entitytestcases {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Mock
	 private Productrepository productrepo;
	@Autowired
	private Productrepository productrepository;
	 
	@Test
	public void whenMapIdToEmployees_thenGetEmployeeStream() {
		
		Integer[] empId = {1,2,3,4};
		
		List<Optional<Product>> collect = Stream.of(empId).map(productrepository::findById).collect(Collectors.toList());
		
		assertEquals(collect.size(),empId);
	}   
	
	
	@Test
	public void testingrepo() {
		
		List<Product> findAll = productrepo.findAll();
		long  a = findAll.parallelStream().filter(x->x.getId()!=0).count();
		
		
	}
	
	
	
	
	
}
