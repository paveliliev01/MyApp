package com.mentormate.restaurant.model.repository;

import com.mentormate.restaurant.model.pojos.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findByOrderIdIn(List<Integer> orderId);

    @Override
    Optional<Order> findById(Integer integer);
}
