package org.example.model;

import lombok.Data;
import lombok.Getter;

public class Product {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}