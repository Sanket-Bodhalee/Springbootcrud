package com.example1.practice1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example1.practice1.Entity.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Integer>{
    
} 
