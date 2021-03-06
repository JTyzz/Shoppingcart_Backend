package com.jasontyzzer.shoppingcart_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long supplierid;

    private String suppliername;
    private int quantity;

    @ManyToMany
    @JoinTable(name = "supplier_products",
            joinColumns = {@JoinColumn(name="supplierid")},
            inverseJoinColumns = {@JoinColumn(name="productid")})
    @JsonIgnoreProperties("suppliers")
    private Set<Product> products = new HashSet<>();

    public Supplier(){

    }

    public long getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(long supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
