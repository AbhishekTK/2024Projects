package com.abhi.ecommercedemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.abhi.ecommercedemo.entity.Product;
import com.abhi.ecommercedemo.service.ProductServiceImpl;

@SpringBootApplication
public class EcommerceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner cmd(ProductServiceImpl ps) {
		return (args) -> {
			ps.saveProducts(new Product(1, "Pencil Set", "ABC", 5.50f));
			ps.saveProducts(new Product(2, "Stationary Pad", "ABC", 7.60f));
			ps.saveProducts(new Product(3, "Stapler", "ABC", 2.40f));
			ps.saveProducts(new Product(4, "Ink Jet Catridge", "ABC", 21.05f));

		};
	}

}
