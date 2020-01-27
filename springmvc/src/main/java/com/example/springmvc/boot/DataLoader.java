package com.example.springmvc.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springmvc.model.Product;
import com.example.springmvc.repository.ProductRepository;

@Component
public class DataLoader implements CommandLineRunner{
	
	private ProductRepository productRepository;
	
	@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		Product product1 = new Product();
		product1.setName("Milky Bar");
		product1.setDescription("Milky Bar with Chocolate and hazelnut");
		product1.setType("CANDIES");
		product1.setCategory("BARS");
		product1.setPrice(1.99);
		
		productRepository.save(product1);
		
		Product product2 = new Product();
		product2.setName("Almond Bar");
		product2.setDescription("Almond Bar with Chocolate and honey");
		product2.setType("CANDIES");
		product2.setCategory("BARS");
		product2.setPrice(2.99);
		
		productRepository.save(product2);
	}

}
