package com.abhi.ecommercedemo.service;

import com.abhi.ecommercedemo.entity.Order;

public interface OrderService {
    public Iterable<Order> getOrders();

    public void saveOrder(Order o);
}
