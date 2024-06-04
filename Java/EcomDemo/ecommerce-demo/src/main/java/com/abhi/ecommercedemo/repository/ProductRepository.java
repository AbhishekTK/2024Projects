package com.abhi.ecommercedemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.abhi.ecommercedemo.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
