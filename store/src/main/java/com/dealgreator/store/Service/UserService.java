package com.dealgreator.store.Service;

import java.util.List;

import com.dealgreator.store.Entity.User;


public interface UserService {
    void addUser(User user); // Create

    List<User> getUsers(); // Get

    User getUserById(Long id); // Search

    void updateUser(User user); // Update

    void deleteUser(Long id); // Delete

}