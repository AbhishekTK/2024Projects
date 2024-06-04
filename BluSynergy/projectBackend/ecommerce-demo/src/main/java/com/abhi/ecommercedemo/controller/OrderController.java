package com.abhi.ecommercedemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.ecommercedemo.entity.Product;
import com.abhi.ecommercedemo.repository.OrderRepository;
import com.abhi.ecommercedemo.service.OrderService;
import com.abhi.ecommercedemo.service.OrderServiceImpl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import com.abhi.ecommercedemo.dto.Customer;
import com.abhi.ecommercedemo.dto.OrderProductDto;
import com.abhi.ecommercedemo.entity.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    // @Autowired
    private OrderService orderService;

    @GetMapping("")
    public Iterable<Order> getOrders() {
        // return new String();
        return this.orderService.getOrders();
    }

    @PostMapping("")
    public void postOrder(@RequestBody OrderForm input) {
        // TODO: process POST request
        Order order = new Order();
        order.setStatus("PAID");
        ArrayList<Product> products = new ArrayList<>();
        for (OrderProductDto o : input.productOrders) {
            products.add(new Product(o.getProduct().getId(), o.getProduct().getName(), o.getProduct().getDesc(),
                    o.getQuantity()));
        }
        validateInput(input);

        order.setOrderProducts(products);
        this.orderService.saveOrder(order);
        ;
    }

    private void validateInput(OrderForm input) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'validateInput'");
        // validate customer
        // OrElseThrow exception
    }

    @Data
    @AllArgsConstructor
    @Getter
    @Setter
    public static class OrderForm {
        private List<OrderProductDto> productOrders;
        private Customer customer;
    }

}
