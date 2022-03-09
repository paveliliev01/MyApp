package com.mentormate.restaurant;

import com.mentormate.restaurant.model.dto.orderDTO.OrderDTO;
import com.mentormate.restaurant.model.dto.orderStatusDTO.OrderStatusDTO;
import com.mentormate.restaurant.model.dto.tableDTO.TableDTO;
import com.mentormate.restaurant.model.dto.userDTO.UserResponseDTO;
import com.mentormate.restaurant.model.pojos.Order;
import com.mentormate.restaurant.model.pojos.OrderStatus;
import com.mentormate.restaurant.model.pojos.Table;
import com.mentormate.restaurant.model.pojos.User;
import com.mentormate.restaurant.model.repository.OrderRepository;
import com.mentormate.restaurant.model.service.converters.OrderConverter;
import com.mentormate.restaurant.model.service.services.OrderService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Date;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {
    @InjectMocks
    OrderService orderService;

    @Mock
    OrderRepository orderRepository;

    @Mock
    OrderConverter orderConverter;

    @Test
    public void test() {
//        OrderConverter orderConverter = new OrderConverter();
//        UserResponseDTO user = new UserResponseDTO();
//        user.setUserId(1);
//        user.setUserName("Waiter");
//        user.setUserEmail("WaiterEmail");
//
//        TableDTO table = new TableDTO();
//        table.setTableNumber(1);
//        table.setTableId(1);
//        OrderStatusDTO orderStatus = new OrderStatusDTO();
//        orderStatus.setStatus("active");
//        orderStatus.setStatusId(1);
//        java.util.Date date = new java.util.Date();
//
//        OrderDTO orderDTO = orderService.createOrder(user,table,orderStatus);
//        System.out.println(orderDTO);









    }
}
