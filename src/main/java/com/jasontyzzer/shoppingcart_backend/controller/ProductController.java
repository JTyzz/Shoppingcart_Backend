package com.jasontyzzer.shoppingcart_backend.controller;

import com.jasontyzzer.shoppingcart_backend.model.Order;
import com.jasontyzzer.shoppingcart_backend.model.Product;
import com.jasontyzzer.shoppingcart_backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    @Autowired
    private ProductRepository productrepo;

    @GetMapping
    public List<Product> listAllProducts() {
        return productrepo.findAll();
    }
}
