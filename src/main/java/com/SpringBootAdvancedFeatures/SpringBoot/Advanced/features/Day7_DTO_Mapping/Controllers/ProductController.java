package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Controllers;

import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Dtos.ProductDto;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Entities.Product;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Mappers.ProductMapper;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day7_DTO_Mapping.Services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;
    private final ProductMapper productMapper;

    public
    ProductController(ProductService productService, ProductMapper productMapper) {
        this
                .productService = productService;
        this
                .productMapper = productMapper;
    }

    @GetMapping("/getByBrand")
    public ResponseEntity<List<ProductDto>> getProductsByBrand(@RequestParam String brand){
        List<Product> productList = productService.getProductsByBrand(brand);
        List<ProductDto> productDtosList = productMapper.toDtoList(productList);
        return ResponseEntity.ok(productDtosList);
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveProduct(@RequestBody ProductDto productDto){
        try {
            productService.saveProduct(productDto);
            return new ResponseEntity<>("Product saved successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to saved product"+e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}










