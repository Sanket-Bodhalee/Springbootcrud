package com.example1.practice1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example1.practice1.Entity.Product;
import com.example1.practice1.Repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product)
    {
      return productRepository.save(product);
    }
}
