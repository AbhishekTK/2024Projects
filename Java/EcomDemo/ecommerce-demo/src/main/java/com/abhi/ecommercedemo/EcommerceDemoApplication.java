package com.abhi.ecommercedemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.abhi.ecommercedemo.model.Product;
import com.abhi.ecommercedemo.service.ProductService;

@SpringBootApplication
public class EcommerceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProductService ps) {
		return args -> {

			ps.save(new Product(1L, "TV Set", 300.00, ""));
			ps.save(new Product(2L, "TV Set", 2200.00, ""));

			ps.save(new Product(3L, "TV Set", 220.00, ""));
			ps.save(new Product(4L, "Mobile 1", 50.00, ""));
			ps.save(new Product(5L, "TV Set", 300.00, ""));
			ps.save(new Product(6L, "TV Set", 2200.00, ""));
			ps.save(new Product(7L, "TV Set", 300.00, ""));
			ps.save(new Product(8L, "TV Set", 2200.00, ""));
			ps.save(new Product(9L, "TV Set", 300.00, ""));

		};
	}
}