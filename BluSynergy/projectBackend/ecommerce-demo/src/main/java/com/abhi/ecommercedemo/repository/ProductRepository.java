package com.abhi.ecommercedemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.abhi.ecommercedemo.entity.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {
    
}
