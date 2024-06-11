package com.example.workintech.e_commerce_backend.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "category", schema = "ecommerce")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    @NotNull
    @NotBlank
    @Size(min = 3, max = 45)
    private String title;

    @Column(name = "rating")
    @NotNull
    private Double rating;

    @Column(name = "gender")
    @NotNull
    @NotBlank
    @Size(min = 3, max = 45)
    private String gender;

    @Column(name = "img")
    @NotNull
    @NotBlank
    private String img;

    //One category has many products
    @OneToMany(mappedBy = "category", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<Product> products = new ArrayList<>();

}
