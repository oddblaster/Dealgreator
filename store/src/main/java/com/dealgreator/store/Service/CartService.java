package com.dealgreator.store.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dealgreator.store.Entity.Cart;

@Component
public interface CartService {

    Cart getCartById(Long id);

    List<Cart> getCarts();

    Cart addCart(Cart Cart);

    void updateCart(Cart Cart);

    void deleteCart(Long id);
}
