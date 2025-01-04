package com.example.product_service.service;


import com.example.product_service.dao.entity.Product;
import com.example.product_service.dao.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

@Autowired
    private  ProductRepo productRepo;
    public ProductService(ProductRepo productRepo){
        this.productRepo=productRepo;
    }
    public List<Product>getAllProducts(){
        return productRepo.findAll();
    }
    public Optional<Product>getProductById(Long id){
        return productRepo.findById(id);
    }
    public Product saveProduct(Product product){
        return productRepo.save(product);
    }
    public Product deleteProduct(Long id){
        productRepo.deleteById(id);

        return null;
    }
}



