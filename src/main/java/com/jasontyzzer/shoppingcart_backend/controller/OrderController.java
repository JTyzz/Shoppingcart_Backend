package com.jasontyzzer.shoppingcart_backend.controller;

import com.jasontyzzer.shoppingcart_backend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/orders", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    @Autowired
    private OrderRepository orderrepo;
}
