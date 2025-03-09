package com.ecom.fullstack.ecommerce.controllers;

import com.ecom.fullstack.ecommerce.model.Product;
import com.ecom.fullstack.ecommerce.services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Product>> getAllProducts() {
//        log.info("get all products controller started.");
        return ResponseEntity.ok(productService.getAllProducts());
    }


    @GetMapping("/get-by-id")
    public ResponseEntity<List<Product>> getAllProductsByCategory(Long categoryId) {
//        log.info("get all products by category id controller started.");
        return ResponseEntity.ok(productService.getAllProductsByCategory(categoryId));
    }
}
