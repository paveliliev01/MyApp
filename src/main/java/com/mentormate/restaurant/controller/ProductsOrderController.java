package com.mentormate.restaurant.controller;

import com.mentormate.restaurant.model.pojos.Order;
import com.mentormate.restaurant.model.pojos.Product;
import com.mentormate.restaurant.model.pojos.ProductsOrder;
import com.mentormate.restaurant.model.repository.OrderRepository;
import com.mentormate.restaurant.model.repository.ProductRepository;
import com.mentormate.restaurant.model.service.converters.UserConverter;
import com.mentormate.restaurant.model.service.services.ProductsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsOrderController {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ProductsOrderService productsOrderService;
    @PostMapping("api/v1/test")
    public void createOrder(){
        Product product = productRepository.findById(1).get();
        Order order = orderRepository.findById(3).get();
        System.out.println(product);
        System.out.println(order);
        productsOrderService.addProductToOrder(order,product);
    }
    @PostMapping("api/v1/test1")
    public List<ProductsOrder> getAll(){
        return productsOrderService.getAll();
    }
}
