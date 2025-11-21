package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Mappers;

import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Dtos.ProductDto;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Entities.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {

    @Autowired
    private ModelMapper modelMapper;

    public ProductDto toDto(Product product){
        return(modelMapper.map(product,ProductDto.class));
    }

    public List<ProductDto> toDtoList(List<Product> products){
        return products.stream().map(this::toDto).collect(Collectors.toList());
    }

    public Product fromDto(ProductDto productDto){
        return modelMapper.map(productDto,Product.class);
    }

}
