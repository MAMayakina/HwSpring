package com.example.hwspring.service;


import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
//@Scope (scopeName = "singleton")
public class ShoppingService {
    private Set<Integer> shoppingCart = new HashSet<>();

    public Integer addProduct(Integer idProduct) {
            this.shoppingCart.add(idProduct);
            return idProduct;
    }

    public Set<Integer> getShoppingCart() {
        return shoppingCart;
    }
}
