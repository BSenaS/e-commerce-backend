package com.example.workintech.e_commerce_backend.entity;

import jakarta.persistence.*;
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

    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "store_id")
    private Integer storeId;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "sell_count")
    private Integer sellCount;


    @Column(name = "img")
    private String img;


    //Her kategorinin sadece 1 tane ürünü olması gerekiyor.Ama her ürün birden fazla kategorisi olabilir.
    //Bunun için buradan Many to One ile ilişki kuruyoruz.
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "category_id")
    private Category category;



}
