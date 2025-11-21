package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String reviewComments;

    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "productId")
    private Product product;

}
