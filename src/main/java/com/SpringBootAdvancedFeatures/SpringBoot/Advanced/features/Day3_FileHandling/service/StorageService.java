package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day3_FileHandling.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface StorageService {
    public String store(MultipartFile file) throws IOException;
    public Resource loadsAsResource(String filename) throws IOException;
    public boolean delete(String filename) throws IOException;
}
