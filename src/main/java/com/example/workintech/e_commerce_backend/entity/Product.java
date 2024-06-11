package com.example.workintech.e_commerce_backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "product", schema = "ecommerce")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotNull
    @NotBlank
    @Size(min = 3, max = 45)
    private String name;

    @Column(name = "description")
    @NotNull
    @NotBlank
    @Size(min = 3, max = 300)
    private String description;

    @Column(name = "price")
    @NotNull
    @NotBlank
    private Double price;

    @Column(name = "stock")
    @NotNull
    @NotBlank
    private Integer stock;

    @Column(name = "rating")
    @NotNull
    @NotBlank
    private Double rating;

    @Column(name = "sell_count")
    @NotNull
    @NotBlank
    private Integer sellCount;


    @Column(name = "img")
    @NotNull
    @NotBlank
    private String img;

    //Her kategorinin sadece 1 tane ürünü olması gerekiyor.Ama her ürün birden fazla kategorisi olabilir.
    //Bunun için buradan Many to One ile ilişki kuruyoruz.
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "category_id")
    private Category category;



}
