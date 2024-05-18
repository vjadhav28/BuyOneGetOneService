package org.example.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BogoOfferService {

    public List<String> calculateBogoOffer(List<Integer> productPriceList) {
        List<String> discountedItems = new ArrayList<>();
        List<String> payableItems = new ArrayList<>();

        productPriceList.sort(Collections.reverseOrder());

        for (int i = 0; i < productPriceList.size(); i++) {
            if (i % 2 == 0) {
                payableItems.add(String.valueOf(productPriceList.get(i)));
            } else {
                discountedItems.add(String.valueOf(productPriceList.get(i)));
            }
        }

        return Collections.singletonList("Discounted Items = " + discountedItems.toString() + ", Payable Items = " + payableItems.toString());
    }

    public List<String> calculateBogoOffer2(List<Integer> productPriceList) {
        List<Integer> discountedItems = new ArrayList<>();
        List<Integer> payableItems = new ArrayList<>();

        // Iterate through the list in pairs
        for (int i = 0; i < productPriceList.size(); i += 2) {
            int firstItem = productPriceList.get(i);
            int secondItem = (i + 1 < productPriceList.size()) ? productPriceList.get(i + 1) : firstItem;

            // Ensure the second item is less than the first item
            if (secondItem < firstItem) {
                discountedItems.add(secondItem);
                payableItems.add(firstItem);
            } else {
                discountedItems.add(firstItem);
                payableItems.add(secondItem);
            }
        }

        // Sort the lists
        Collections.sort(discountedItems, Collections.reverseOrder()); // Sort in descending order
        Collections.sort(payableItems); // Sort in ascending order

        return Arrays.asList(
                "Discounted Items = " + discountedItems.toString(),
                "Payable Items = " + payableItems.toString()
        );
    }


    public List<String> calculateBogoOffer3(List<Integer> productPriceList) {
        List<Integer> discountedItems = new ArrayList<>();
        List<Integer> payableItems = new ArrayList<>();

        for (int i = 0; i < productPriceList.size(); i += 4) {
            for (int j = 0; j < 2 && i + j < productPriceList.size(); j++) {
                payableItems.add(productPriceList.get(i + j));
            }
            for (int j = 2; j < 4 && i + j < productPriceList.size(); j++) {
                discountedItems.add(productPriceList.get(i + j));
            }
        }

        return Arrays.asList(
                "Discounted Items = " + discountedItems,
                "Payable Items = " + payableItems
        );
    }
}