package com.mentormate.restaurant.model.service.services;

import com.mentormate.restaurant.model.pojos.Order;
import com.mentormate.restaurant.model.pojos.OrderStatus;
import com.mentormate.restaurant.model.pojos.Product;
import com.mentormate.restaurant.model.pojos.ProductsOrder;
import com.mentormate.restaurant.model.repository.ProductsOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;


@Service
public class ProductsOrderService {
    @Autowired
    ProductsOrderRepository productsOrderRepository;
    public void addProductToOrder(Order order, Product product){
        ProductsOrder productsOrder = new ProductsOrder();
        productsOrder.setProductId(product);
        productsOrder.setOrderId(order);
        productsOrderRepository.save(productsOrder);
    }
    public List<ProductsOrder> getAll(){
        return productsOrderRepository.findAll();
    }
}
