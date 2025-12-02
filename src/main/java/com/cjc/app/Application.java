package com.cjc.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.cjc.app.model.Product;
import com.cjc.app.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductRepository productRepository = context.getBean(ProductRepository.class);
			
	}


	private static void sortingInDsc(ProductRepository productRepository) {
		
		//Sorting in descending order According to price
		
		Sort sort = Sort.by(Direction.DESC, "price");
		
		List<Product> list = productRepository.findAll(sort);
		
		list.forEach(pr -> System.out.println(pr));
	}


	private static void sortingInAsc(ProductRepository productRepository) {
		
		//// Sorting :Sort According to price
		
		Sort sort = Sort.by("price");
		
		List<Product> list = productRepository.findAll(sort);
		
		list.forEach(pr -> System.out.println(pr));
	}
    
	
	private static void pagination(ProductRepository productRepository) {
		
		// Pagination : Total number of Records display on Page.
		
		PageRequest pageRequest = PageRequest.of(0, 5);
		
		Page<Product> page = productRepository.findAll(pageRequest);
		
		List<Product> list = page.getContent();
		
		list.forEach(pr -> System.out.println(pr));
	}

}
