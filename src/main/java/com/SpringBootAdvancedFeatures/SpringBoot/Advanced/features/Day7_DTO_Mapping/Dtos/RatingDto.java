package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RatingDto {

    @JsonProperty("id")
    private long id;

    @JsonProperty("ratingValue")
    private double ratingValue;

}
