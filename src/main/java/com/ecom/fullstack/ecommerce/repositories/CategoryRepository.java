package com.ecom.fullstack.ecommerce.repositories;

import com.ecom.fullstack.ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {




}
