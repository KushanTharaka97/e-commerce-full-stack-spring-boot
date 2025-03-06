package com.ecom.fullstack.ecommerce.services;

import com.ecom.fullstack.ecommerce.model.Product;
import com.ecom.fullstack.ecommerce.repositories.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
//        log.info("get all the products service");

        List<Product> productList = productRepository.findAll();
        return productList;

    }


    public List<Product> getAllProductsByCategory(Long idOfTheCategory) {
//        log.info("get all the products service.");
        List<Product> productList = productRepository.findByCategoryId(idOfTheCategory);
        return productList;

    }
}
