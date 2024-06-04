package com.abhi.ecommercedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abhi.ecommercedemo.entity.Product;
import com.abhi.ecommercedemo.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void saveProducts(Product p) {
        this.productRepository.save(p);
    }

    public Iterable<Product> getProducts() {
        return this.productRepository.findAll();
    }

}
