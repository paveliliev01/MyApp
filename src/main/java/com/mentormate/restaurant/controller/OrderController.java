package com.mentormate.restaurant.controller;

import com.mentormate.restaurant.model.dto.orderDTO.OrderDTO;
import com.mentormate.restaurant.model.dto.orderStatusDTO.OrderStatusDTO;
import com.mentormate.restaurant.model.dto.tableDTO.TableDTO;
import com.mentormate.restaurant.model.dto.userDTO.UserResponseDTO;
import com.mentormate.restaurant.model.pojos.Order;
import com.mentormate.restaurant.model.pojos.OrderStatus;
import com.mentormate.restaurant.model.pojos.Table;
import com.mentormate.restaurant.model.pojos.User;
import com.mentormate.restaurant.model.repository.OrderRepository;
import com.mentormate.restaurant.model.repository.TableRepository;
import com.mentormate.restaurant.model.repository.UserRepository;
import com.mentormate.restaurant.model.service.converters.OrderStatusConverter;
import com.mentormate.restaurant.model.service.converters.UserConverter;
import com.mentormate.restaurant.model.service.services.OrderService;
import com.mentormate.restaurant.model.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    TableRepository tableRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserConverter userConverter;
    @Autowired
    OrderRepository orderRepository;


    @PutMapping("api/v1/createOrder")
    public void createOrder(){
        orderService.createOrder(userConverter.toDto(userRepository.findById(1).get()),tableRepository.getById(1));
    }

    @GetMapping("api/v1/getAllOrders")
    public List<Order> getAll(){
        return orderRepository.findAll();
    }
}
