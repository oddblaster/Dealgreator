package com.dealgreator.store.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dealgreator.store.Entity.User;
import com.dealgreator.store.Repository.UserRepo;

@Service
public class UserImplmentation implements UserService {

    @Autowired
    UserRepo UserRepo;

    @Override
    public void addUser(User user) {
        UserRepo.save(user);
    }

    @Override
    public List<User> getUsers() {
        return UserRepo.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return UserRepo.findById(id).get();
    }

    @Override
    public void updateUser(User user) {
        UserRepo.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        UserRepo.deleteById(id);
    }
}
