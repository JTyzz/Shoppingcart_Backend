package com.jasontyzzer.shoppingcart_backend.repository;

import com.jasontyzzer.shoppingcart_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}