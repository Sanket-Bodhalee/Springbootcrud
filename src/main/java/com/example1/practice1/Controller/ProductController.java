package com.example1.practice1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example1.practice1.Entity.Product;
import com.example1.practice1.services.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @PostMapping("/saveProduct")
    public Product product( @RequestBody Product product)
    {
        return productService.addProduct(product) ;
    }

}
