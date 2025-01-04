package com.example.product_service.controller;


import com.example.product_service.dao.entity.Product;
import com.example.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins ="http //localhost:4200")
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService){
        this.productService=productService;
    }
    @GetMapping
    public List<Product>getALlProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    public Optional<Product>getProductByIdProduct(@PathVariable Long id){
        return productService.getProductById(id);
    }
    @PostMapping
    public Product createProducte(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id,@RequestBody Product product){
        product.setId(id);
        return productService.saveProduct(product);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }
}
