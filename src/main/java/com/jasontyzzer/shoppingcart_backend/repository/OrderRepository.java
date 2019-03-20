package com.jasontyzzer.shoppingcart_backend.repository;

import com.jasontyzzer.shoppingcart_backend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
