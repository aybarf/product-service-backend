package com.example.product_service.dao.repository;

import com.example.product_service.dao.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {
}
