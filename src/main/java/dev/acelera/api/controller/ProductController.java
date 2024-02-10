package dev.acelera.api.controller;

import dev.acelera.api.product.ProductResgistrationData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProductController {
    @PostMapping
    public void register(@RequestBody ProductResgistrationData data) {
        System.out.println(data);
    }

    @GetMapping
    public String teste(){
        return "teste produto";
    }
}
