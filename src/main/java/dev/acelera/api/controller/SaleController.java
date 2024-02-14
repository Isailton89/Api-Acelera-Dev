package dev.acelera.api.controller;

import dev.acelera.api.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class SaleController {
    @Autowired
    private SaleService saleService;

    @PostMapping("sale")
    @Transactional
    public ResponseEntity<String> uploadFile(@RequestBody byte[] file) throws IOException {
        saleService.saveXlsx(file);
        return ResponseEntity.status(HttpStatus.CREATED).body("Arquivo enviado");
    }
}
