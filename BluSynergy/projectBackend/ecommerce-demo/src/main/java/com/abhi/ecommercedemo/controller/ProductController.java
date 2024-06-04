package com.abhi.ecommercedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.ecommercedemo.entity.Product;
import com.abhi.ecommercedemo.repository.OrderRepository;
import com.abhi.ecommercedemo.repository.ProductRepository;
import com.abhi.ecommercedemo.service.ProductService;

import jakarta.annotation.Nonnull;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public @Nonnull Iterable<Product> getProducts() {
        return this.productService.getProducts();
    }

}
