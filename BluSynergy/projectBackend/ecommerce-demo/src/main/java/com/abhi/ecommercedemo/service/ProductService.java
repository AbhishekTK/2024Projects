package com.abhi.ecommercedemo.service;

import com.abhi.ecommercedemo.entity.Product;

public interface ProductService {

    public Iterable<Product> getProducts();

    public void saveProducts(Product p);
}
