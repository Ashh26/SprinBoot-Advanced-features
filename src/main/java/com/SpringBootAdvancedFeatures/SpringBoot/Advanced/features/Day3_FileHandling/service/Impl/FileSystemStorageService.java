package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day3_FileHandling.service.Impl;

import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day3_FileHandling.service.StorageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;

@Service
public class FileSystemStorageService implements StorageService {

//    private final Path root;

//    public FileSystemStorageService(@Value("${spring.servlet.multipart.location}") String storageLocation) {
//        this.root = root;
//    }

    @Override
    public String store(MultipartFile file) throws IOException {
        return "";
    }

    @Override
    public Resource loadsAsResource(String filename) throws IOException {
        return null;
    }

    @Override
    public boolean delete(String filename) throws IOException {
        return false;
    }
}
