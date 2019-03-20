package com.jasontyzzer.shoppingcart_backend.repository;

import com.jasontyzzer.shoppingcart_backend.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
