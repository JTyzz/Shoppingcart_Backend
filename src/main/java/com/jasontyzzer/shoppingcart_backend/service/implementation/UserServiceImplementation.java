package com.jasontyzzer.shoppingcart_backend.service.implementation;

import com.jasontyzzer.shoppingcart_backend.model.User;
import com.jasontyzzer.shoppingcart_backend.repository.UserRepository;
import com.jasontyzzer.shoppingcart_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "userService")
public class UserServiceImplementation implements UserDetailsService, UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(userId);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), user.getAuthority());
    }

    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        userRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}