package dev.acelera.api.controller;

import dev.acelera.api.product.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<ProductDataList> list() {
        return repository.findAll().stream().map(ProductDataList::new).toList();
    }

    @PutMapping
    @Transactional
    public void updateData(@RequestBody ProductUpdateData data) {
        var product = repository.getReferenceById(data.id());
        product.updateData(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity delete(@PathVariable Long id) {

        repository.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
