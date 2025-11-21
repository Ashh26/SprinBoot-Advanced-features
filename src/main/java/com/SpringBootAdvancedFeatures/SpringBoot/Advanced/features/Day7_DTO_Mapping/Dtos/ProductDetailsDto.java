package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductDetailsDto {

    @JsonProperty("productDetailsId")
    private int productDetailsId;

    @JsonProperty("technicalSpecs")
    private String technicalSpecifications;

    @JsonProperty("extraFeatures")
    private String specialFeatures;

    @JsonProperty("extendedDescription")
    private String extendedDescription;

}
