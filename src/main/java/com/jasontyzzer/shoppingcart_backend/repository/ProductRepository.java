package com.jasontyzzer.shoppingcart_backend.repository;

import com.jasontyzzer.shoppingcart_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
