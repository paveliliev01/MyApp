package com.mentormate.restaurant.model.repository;

import com.mentormate.restaurant.model.pojos.Order;
import com.mentormate.restaurant.model.pojos.ProductsOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductsOrderRepository extends JpaRepository<ProductsOrder, Integer> {
    List<ProductsOrder> findAll();
    Optional<ProductsOrder>getById(int id);
}
