package com.mentormate.restaurant.model.service.converters;

import com.mentormate.restaurant.model.dto.orderDTO.OrderDTO;
import com.mentormate.restaurant.model.pojos.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderConverter {

    public OrderDTO toDto(Order entity) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderStatus(entity.getOrderStatus());
        orderDTO.setTable(entity.getTable());
        orderDTO.setOrderDate(entity.getOrderDate());
        orderDTO.setWaiter(entity.getWaiter());
        return orderDTO;
    }

    public Order toEntity(OrderDTO dto) {
        Order entity = new Order();
        entity.setOrderDate(dto.getOrderDate());
        entity.setOrderStatus(dto.getOrderStatus());
        entity.setTable(dto.getTable());
        entity.setWaiter(dto.getWaiter());

        return entity;
    }
}
