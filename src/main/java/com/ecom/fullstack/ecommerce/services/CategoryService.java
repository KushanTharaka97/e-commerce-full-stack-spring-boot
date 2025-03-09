package com.ecom.fullstack.ecommerce.services;

import com.ecom.fullstack.ecommerce.model.Category;
import com.ecom.fullstack.ecommerce.model.Product;
import com.ecom.fullstack.ecommerce.repositories.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllTheCategories(){
//        log.info("started the get all categories service");
        return categoryRepository.findAll();
    }


    public Category getCategoryById(Long categoryIdToSearch){
//        log.info("started the get all categories service");
        return categoryRepository.findById(categoryIdToSearch).get();
    }

}

