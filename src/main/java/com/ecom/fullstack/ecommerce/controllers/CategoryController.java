package com.ecom.fullstack.ecommerce.controllers;

import com.ecom.fullstack.ecommerce.model.Category;
import com.ecom.fullstack.ecommerce.services.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/get-all")
    public List<Category> getAllCategories() {
//        log.info("Started the get all categories");
        return categoryService.getAllTheCategories();
    }

    @GetMapping("/get-by-id")
    public ResponseEntity<Category> getCategoryById(Long getCategoryId) {
//        log.info("Started the get all categories");
        return ResponseEntity.ok(categoryService.getCategoryById(getCategoryId));
    }
}
