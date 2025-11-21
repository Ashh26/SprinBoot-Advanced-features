package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Services;

import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Dtos.ProductDto;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Entities.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getProductsByBrand(String brand);
    public void saveProduct(ProductDto productDto);
}
