package com.mentormate.restaurant.model.service.services;

import com.mentormate.restaurant.model.dto.orderDTO.OrderDTO;
import com.mentormate.restaurant.model.dto.userDTO.UserResponseDTO;
import com.mentormate.restaurant.model.pojos.Order;
import com.mentormate.restaurant.model.pojos.OrderStatus;
import com.mentormate.restaurant.model.pojos.Table;
import com.mentormate.restaurant.model.repository.OrderRepository;
import com.mentormate.restaurant.model.repository.OrderStatusRepository;
import com.mentormate.restaurant.model.service.converters.OrderConverter;
import com.mentormate.restaurant.model.service.converters.UserConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    UserConverter userConverter;
    @Autowired
    OrderStatusRepository orderStatusRepository;
    @Autowired
    OrderConverter orderConverter;


    public void createOrder(UserResponseDTO userR, Table table) {
        java.util.Date date = new java.util.Date();
        Order order = new Order();
        OrderStatus orderStatus = orderStatusRepository.getById(2);
        order.setWaiter(userConverter.toEntity(userR));
        order.setTable(table);
        order.setOrderStatus(orderStatus);
        order.setOrderDate(Date.valueOf(new Date(date.getTime()).toLocalDate()));
        orderRepository.save(order);
    }

    public List<OrderDTO> findAll() {
        List<Order> orders = orderRepository.findAll();
        return orders.stream()
                .map(orderConverter::toDto)
                .collect(Collectors.toList());
    }


}
