package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReviewDto {

    @JsonProperty("id")
    private long id;

    @JsonProperty("comment")
    private String reviewComment;

}
