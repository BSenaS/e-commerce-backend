package com.example.workintech.e_commerce_backend.service;

import com.example.workintech.e_commerce_backend.entity.Product;
import com.example.workintech.e_commerce_backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findById(Long id) {
        Optional<Product> productOptional = productRepository.findById(id);
        if(productOptional.isPresent()){
            return productOptional.get();
        }else{
            return null;
        }

    }
}
