package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productDetailsId;

    private String technicalSpecifications;
    private String specialFeatures;
    private String extendedDescription;



}
