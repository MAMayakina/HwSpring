package com.example.hwspring.service;

import com.example.hwspring.request.ShoppingRequest;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
//@Scope (scopeName = "singleton")
public class ShoppingService {
    private Set<Integer> shoppingCart = new HashSet<>();

    public Integer addProduct(ShoppingRequest... shoppingRequest) {
        for (ShoppingRequest request : shoppingRequest) {
            this.shoppingCart.add(request.getIdProduct());
            return request.getIdProduct();
        }
        return 1;
    }

    public Set<Integer> getShoppingCart() {
        return shoppingCart;
    }
}
