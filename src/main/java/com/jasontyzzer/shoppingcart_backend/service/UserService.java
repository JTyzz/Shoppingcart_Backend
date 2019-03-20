package com.jasontyzzer.shoppingcart_backend.service;

import com.jasontyzzer.shoppingcart_backend.model.User;

import java.util.List;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}