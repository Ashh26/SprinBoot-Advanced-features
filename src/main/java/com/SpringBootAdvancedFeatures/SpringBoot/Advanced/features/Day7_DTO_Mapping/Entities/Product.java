package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;

    private String productName;
    private String description;
    private String category;
    private String brand;
    private String manufacturer;
    private String color;
    private String size;

    private double price;
    private int stockQuantity;
    private boolean isActive;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "product_details_id",referencedColumnName = "productDetailsId")
    private ProductDetails productDetails;

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Rating> ratings;

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Review> reviews;

}
