package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.service.BogoOfferService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BogoOfferServiceTest {

    @Test
    void testCalculateBogoOffer() {
        BogoOfferService service = new BogoOfferService();
        List<Integer> productPriceList = Arrays.asList(10, 5, 15, 8);
        List<String> expectedResult = Arrays.asList("Discounted Items = [8, 5], Payable Items = [10, 15]");
        assertEquals(expectedResult, service.calculateBogoOffer(productPriceList));
    }

    @Test
    void testCalculateBogoOffer2() {
        BogoOfferService service = new BogoOfferService();
        List<Integer> productPriceList = Arrays.asList(10, 5, 15, 8);
        List<String> expectedResult = Arrays.asList("Discounted Items = [8, 5], Payable Items = [10, 15]");
        assertEquals(expectedResult, service.calculateBogoOffer2(productPriceList));
    }

    @Test
    void testCalculateBogoOffer3() {
        BogoOfferService service = new BogoOfferService();
        List<Integer> productPriceList = Arrays.asList(10, 5, 15, 8);
        List<String> expectedResult = Arrays.asList("Discounted Items = [8, 5], Payable Items = [10, 15]");
        assertEquals(expectedResult, service.calculateBogoOffer3(productPriceList));
    }

    @Test
    void testEmptyList() {
        BogoOfferService service = new BogoOfferService();
        List<Integer> productPriceList = new ArrayList<>();
        List<String> expectedResult = Arrays.asList("Discounted Items = [], Payable Items = []");
        assertEquals(expectedResult, service.calculateBogoOffer(productPriceList));
    }

    @Test
    void testOddNumberOfItems() {
        BogoOfferService service = new BogoOfferService();
        List<Integer> productPriceList = Arrays.asList(10, 5, 15);
        List<String> expectedResult = Arrays.asList("Discounted Items = [5], Payable Items = [10, 15]");
        assertEquals(expectedResult, service.calculateBogoOffer2(productPriceList));
    }
    @Test
    void testSingleItem() {
        BogoOfferService service = new BogoOfferService();
        List<Integer> productPriceList = Arrays.asList(10);
        List<String> expectedResult = Arrays.asList("Discounted Items = [], Payable Items = [10]");
        assertEquals(expectedResult, service.calculateBogoOffer2(productPriceList));
    }
    @Test
    void testMixedPrices() {
        BogoOfferService service = new BogoOfferService();
        List<Integer> productPriceList = Arrays.asList(100, 50, 150, 80);
        List<String> expectedResult = Arrays.asList("Discounted Items = [80], Payable Items = [100, 150]");
        assertEquals(expectedResult, service.calculateBogoOffer2(productPriceList));
    }

}