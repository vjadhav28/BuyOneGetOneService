package org.example.controller;

import org.example.service.BogoOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/bogo")
public class BogoController {

    private final BogoOfferService bogoOfferService;

    @Autowired
    public BogoController(BogoOfferService bogoOfferService) {
        this.bogoOfferService = bogoOfferService;
    }

    @GetMapping("/offer")
    public ResponseEntity<List<String>> calculateBogoOffer(@RequestParam("productPriceList") List<Integer> productPriceList) {
        return ResponseEntity.ok(bogoOfferService.calculateBogoOffer(productPriceList));
    }

    @GetMapping("/offer2")
    public ResponseEntity<List<List<String>>> calculateBogoOffer2(@RequestParam("productPriceList") List<Integer> productPriceList) {
        return ResponseEntity.ok(Collections.singletonList(bogoOfferService.calculateBogoOffer2(productPriceList)));
    }

    @GetMapping("/offer3")
    public ResponseEntity<List<String>> calculateBogoOffer3(@RequestParam("productPriceList") List<Integer> productPriceList) {
        return ResponseEntity.ok(bogoOfferService.calculateBogoOffer3(productPriceList));
    }
}