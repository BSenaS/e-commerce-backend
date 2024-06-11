package com.example.workintech.e_commerce_backend.service;

import com.example.workintech.e_commerce_backend.dto.CategoryResponse;
import com.example.workintech.e_commerce_backend.entity.Category;
import com.example.workintech.e_commerce_backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryResponse save(Category category) {
        Category savedCategory = categoryRepository.save(category);
        return new CategoryResponse(savedCategory.getId(), savedCategory.getTitle(), savedCategory.getRating(), savedCategory.getGender(), savedCategory.getImg());
    }

    @Override
    public List<CategoryResponse> findAll() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map(category -> new CategoryResponse(category.getId(), category.getTitle(), category.getRating(), category.getGender(), category.getImg())).toList();
    }
}
