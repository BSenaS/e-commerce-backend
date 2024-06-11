package com.example.workintech.e_commerce_backend.service;

import com.example.workintech.e_commerce_backend.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product save(Product product);

    Product findById(Long id);

}
