package com.dealgreator.store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dealgreator.store.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
