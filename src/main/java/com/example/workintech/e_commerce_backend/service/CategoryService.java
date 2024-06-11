package com.example.workintech.e_commerce_backend.service;

import com.example.workintech.e_commerce_backend.dto.CategoryResponse;
import com.example.workintech.e_commerce_backend.entity.Category;

import java.util.List;

public interface CategoryService {
    CategoryResponse save(Category category);

    List<CategoryResponse> findAll();
}
