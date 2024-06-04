package com.abhi.ecommercedemo.dto;

import com.abhi.ecommercedemo.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class OrderProductDto {
    
    private Product product;
    private Integer quantity;
}
