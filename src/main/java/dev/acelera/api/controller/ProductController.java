package dev.acelera.api.controller;

import dev.acelera.api.product.Product;
import dev.acelera.api.product.ProductRepository;
import dev.acelera.api.product.ProductResgistrationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    @Transactional
    public void register(@RequestBody ProductResgistrationData data) {
        repository.save(new Product(data));
    }

    @GetMapping
    public String teste(){
        return "teste produto";
    }
}
