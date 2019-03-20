package com.jasontyzzer.shoppingcart_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userid;

    private String username, password, role, fullname, phonenumber, email, billingaddress, shippingaddress;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "user")
    @JsonIgnoreProperties("userid")
    private Set<Order> orders;

    public User(){

    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBillingaddress() {
        return billingaddress;
    }

    public void setBillingaddress(String billingaddress) {
        this.billingaddress = billingaddress;
    }

    public String getShippingaddress() {
        return shippingaddress;
    }

    public void setShippingaddress(String shippingaddress) {
        this.shippingaddress = shippingaddress;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public List<SimpleGrantedAuthority> getAuthority() {
        String myRole = "ROLE_" + this.role.toUpperCase();
        return Arrays.asList(new SimpleGrantedAuthority(myRole));
    }
}
