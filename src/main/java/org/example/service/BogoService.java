package org.example.service;

import org.example.model.Product;
import org.example.util.BogoUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BogoService {
    public List<Product> applyBogoOffer(List<Product> products) {
        return BogoUtil.calculateBogo(products);
    }
}