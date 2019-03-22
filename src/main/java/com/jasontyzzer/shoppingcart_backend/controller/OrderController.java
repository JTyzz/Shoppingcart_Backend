package com.jasontyzzer.shoppingcart_backend.controller;

import com.jasontyzzer.shoppingcart_backend.model.Order;
import com.jasontyzzer.shoppingcart_backend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/orders", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    @Autowired
    private OrderRepository orderrepo;

    @GetMapping
    public List<Order> listAllOrders() {
        return orderrepo.findAll();
    }
}
