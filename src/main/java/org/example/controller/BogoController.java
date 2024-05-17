package org.example.controller;

import org.example.model.Product;
import org.example.service.BogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ServletComponentScan
@RequestMapping("/bogo")
public class BogoController {

    @Autowired
    private BogoService bogoService;

    @PostMapping("/apply")
    public List<Product> applyBogoOffer(@RequestBody List<Product> products) {
        return bogoService.applyBogoOffer(products);
    }
}