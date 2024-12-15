package com.ecom.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.Ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
