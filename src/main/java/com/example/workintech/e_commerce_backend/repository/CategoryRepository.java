package com.example.workintech.e_commerce_backend.repository;

import com.example.workintech.e_commerce_backend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
