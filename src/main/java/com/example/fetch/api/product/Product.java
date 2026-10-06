package com.example.fetch.api.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity 
public class Product {

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private Double price;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "category")
    private String category;

    @Column(name = "image")
    private String image;

    @Column(name = "rating")
    private Rating rating;
}
