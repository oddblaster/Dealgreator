package com.dealgreator.store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dealgreator.store.Entity.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, Long> {

}
