package com.dealgreator.store.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dealgreator.store.Entity.User;

@Component
public interface UserService {
    void addUser(User user); // Create

    List<User> getUsers(); // Get

    User getUserById(Long id); // Search

    void updateUser(User user); // Update

    void deleteUser(Long id); // Delete

}