package com.abhi.ecommercedemo.repository;

import org.springframework.data.repository.CrudRepository;
import com.abhi.ecommercedemo.entity.Order;

public interface OrderRepository extends CrudRepository<Order,Integer>{
    
}
