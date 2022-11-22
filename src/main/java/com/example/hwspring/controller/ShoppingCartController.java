package com.example.hwspring.controller;

import com.example.hwspring.service.ShoppingService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class ShoppingCartController {
    private final ShoppingService shoppingService;


    public ShoppingCartController(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @PostMapping("/shoppingCart/add")
    public Integer addProduct(@RequestParam ("id") Integer idProduct){
            this.shoppingService.addProduct(idProduct);
            return idProduct;
    }

    @GetMapping("/shoppingCart/get")
    public Set<Integer> getShoppingCart() {
        return this.shoppingService.getShoppingCart();
    }

}
