package org.example;

import org.example.controller.BogoController;
import org.example.model.Product;
import org.example.service.BogoService;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@WebMvcTest(BogoController.class)
class BogoApplicationTests {

    @Autowired
    private BogoService bogoService;

    @Test
    void testBogoOffer() {
        List<Product> products = Arrays.asList(
                new Product(10, "Product1", 10.0, 1),
                new Product(20, "Product2", 20.0, 1),
                new Product(30, "Product3", 30.0, 1),
                new Product(40, "Product4", 40.0, 1),
                new Product(50, "Product5", 50.0, 1),
                new Product(60, "Product6", 60.0, 1)
        );
        List<Product> discountedItems = bogoService.applyBogoOffer(products);

        Assert.assertEquals(3, discountedItems.size());
        Assert.assertEquals(new Product(10, "Product1", 10.0, 1), discountedItems.get(0));
        Assert.assertEquals(new Product(30, "Product3", 30.0, 1), discountedItems.get(1));
        Assert.assertEquals(new Product(50, "Product5", 50.0, 1), discountedItems.get(2));
    }

    @Test
    void testBogoOfferWithEmptyList() {
        List<Product> products = new ArrayList<>();
        List<Product> discountedItems = bogoService.applyBogoOffer(products);

        Assert.assertEquals(0, discountedItems.size());
    }

    @Test
    void testBogoOfferWithOneProduct() {
        List<Product> products = Collections.singletonList(new Product(10, "Product1", 10.0, 1));
        List<Product> discountedItems = bogoService.applyBogoOffer(products);

        Assert.assertEquals(1, discountedItems.size());
        Assert.assertEquals(new Product(10, "Product1", 10.0, 1), discountedItems.get(0));
    }
}