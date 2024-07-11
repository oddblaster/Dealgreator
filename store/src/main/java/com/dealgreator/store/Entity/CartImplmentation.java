package com.dealgreator.store.Entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dealgreator.store.Repository.CartRepo;
import com.dealgreator.store.Service.CartService;

@Service
public class CartImplmentation implements CartService {

    @Autowired
    CartRepo CartRepo;

    @Override
    public Cart addCart(Cart Cart) {
        return CartRepo.save(Cart);
    }

    @Override
    public List<Cart> getCarts() {
        return CartRepo.findAll();
    }

    @Override
    public Cart getCartById(Long id) {
        return CartRepo.findById(id).get();
    }

    @Override
    public void updateCart(Cart Cart) {
        CartRepo.save(Cart);
    }

    @Override
    public void deleteCart(Long id) {
        CartRepo.deleteById(id);
    }
}
