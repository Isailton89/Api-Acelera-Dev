package dev.acelera.api.controller;

import dev.acelera.api.productStock.ProductStock;
import dev.acelera.api.productStock.ProductStockRegistrationData;
import dev.acelera.api.productStock.ProductStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stock")
public class ProductStockController {

    @Autowired
    private ProductStockRepository repository;

    @PostMapping
    @Transactional
    public void register(@RequestBody ProductStockRegistrationData data) {
        repository.save(new ProductStock(data));
    }
}
