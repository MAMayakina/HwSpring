package com.example.hwspring.model;


public class ShoppingCart {
    private final int id;

    public ShoppingCart(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                '}';
    }
}
