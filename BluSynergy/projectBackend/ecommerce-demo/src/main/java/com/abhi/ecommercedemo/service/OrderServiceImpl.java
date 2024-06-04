package com.abhi.ecommercedemo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.abhi.ecommercedemo.entity.Order;
import com.abhi.ecommercedemo.entity.Product;
import com.abhi.ecommercedemo.repository.OrderRepository;

public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Iterable<Order> getOrders() {
        // TODO Auto-generated method stub
        return this.orderRepository.findAll();
    }

    @Override
    public void saveOrder(Order order) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'saveOrder'");
        this.orderRepository.save(order);
    }

}
