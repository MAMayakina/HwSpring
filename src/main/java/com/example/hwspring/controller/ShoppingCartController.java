package com.example.hwspring.controller;

import com.example.hwspring.request.ShoppingRequest;
import com.example.hwspring.service.ShoppingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class ShoppingCartController {
    private final ShoppingService shoppingService;

    public ShoppingCartController(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @PostMapping("/shoppingCart/add")
    public Integer addProduct(@RequestBody ShoppingRequest ...shoppingRequest){
        for (ShoppingRequest request : shoppingRequest) {
            this.shoppingService.addProduct(request);
            return request.getIdProduct();
        }
        return 1;
    }

    @GetMapping("/shoppingCart/get")
    public Set<Integer> getShoppingCart() {
        return this.shoppingService.getShoppingCart();
    }

}
