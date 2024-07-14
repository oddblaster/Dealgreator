package com.dealgreator.store.Service;

import java.util.List;

import com.dealgreator.store.Entity.Cart;

public interface CartService {

    Cart getCartById(Long id);

    List<Cart> getCarts();

    Cart addCart(Cart Cart);

    void updateCart(Cart Cart);

    void deleteCart(Long id);
}
