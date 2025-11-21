package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProductDto {

    private String ProductName;
    private String brand;

    @JsonProperty("manufacturerName")
    private String manufacturer;

    @JsonProperty("productDetails")
    private ProductDetailsDto productDetails;

    @JsonProperty("reviews")
    private List<ReviewDto> reviews;

    @JsonProperty("productRatings")
    public List<RatingDto> ratings;

}












