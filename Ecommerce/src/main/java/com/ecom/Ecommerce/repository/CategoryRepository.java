package com.ecom.Ecommerce.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.Ecommerce.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
