package com.dealgreator.store.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dealgreator.store.Entity.Cart;
import com.dealgreator.store.Service.CartService;

@RestController
@RequestMapping("/cart")
public class cartController {

    @Autowired
    CartService CartService;

    @PostMapping("/addCart")
    public ResponseEntity<Object> addCart(@RequestBody Cart Cart) {
        try {
            CartService.addCart(Cart);

            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @GetMapping("/getCarts")
    public ResponseEntity<List<Cart>> getCarts() {
        try {
            return new ResponseEntity<>(CartService.getCarts(), HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @GetMapping("/getCart/{id}")
    public ResponseEntity<Cart> getCartById(@RequestBody Cart Cart) {
        try {
            return new ResponseEntity<>(CartService.getCartById(Cart.getId()), HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @DeleteMapping("/deleteCart")
    public ResponseEntity<Object> deleteCart(@RequestBody Cart Cart) {
        try {
            CartService.deleteCart(Cart.getId());
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @PostMapping("/updateCart")
    public ResponseEntity<Object> updateCart(@RequestBody Cart Cart) {
        try {
            CartService.updateCart(Cart);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

}
