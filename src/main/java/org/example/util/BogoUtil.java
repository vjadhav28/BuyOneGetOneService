package org.example.util;

import org.example.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BogoUtil {
    public static List<Product> calculateBogo(List<Product> products) {
        List<Product> discountedItems = new ArrayList<>();
        List<Product> payableItems = new ArrayList<>(products);

        payableItems.sort(Comparator.comparingDouble(Product::getPrice).reversed());

        for (int i = 0; i < payableItems.size() - 1; i += 2) {
            discountedItems.add(payableItems.get(i + 1));
        }

        payableItems.removeAll(discountedItems);

        return discountedItems;
    }
}