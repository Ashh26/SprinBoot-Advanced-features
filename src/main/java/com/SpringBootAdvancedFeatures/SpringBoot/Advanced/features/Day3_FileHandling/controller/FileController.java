package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day3_FileHandling.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

@Controller
public class FileController {


    // Uploading a file
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String uploadFile(@RequestParam("file")MultipartFile file){

        // Setting up file path
        String filePath = System.getProperty("user.dir") + "C:\\Users\\ASUS\\OneDrive\\Pictures" +
                File.separator + file.getOriginalFilename();
        String fileUploadStatus;

        try {
            FileOutputStream fout = new FileOutputStream(filePath);
            fout.write(file.getBytes());

            // closing connection
            fout.close();
            fileUploadStatus = "File uploaded successful";

        }catch (Exception e){
            e.printStackTrace();
            fileUploadStatus = "Error uploading file" + e ;
        }

        return fileUploadStatus;
    }

    // Get list of all uploaded data file
    @RequestMapping(value = "/getFiles",method = RequestMethod.GET)
    public String[] getFiles(){
        String folderPath = System.getProperty("user.dir") + "/Uploads";

        File fileDirectory = new File(folderPath);

        // list() method returns an array of strings
        // naming the files and directories
        // in the directory denoted by this abstract pathname
        String[] fileList = fileDirectory.list();

        return fileList;
    }

    // Downloading a file
    @RequestMapping(value = "/download/{path:.+}",method = RequestMethod.GET)
    public ResponseEntity downloadFile(@PathVariable("path") String filename) throws FileNotFoundException{

        // Checking whether the file requested for download exists or not
        String fileUploadPath = System.getProperty("user.dir") + "/Uploads";
        String[] filenames = this.getFiles();
        boolean contains = Arrays.asList(filenames).contains(filename);
        if(!contains){
            return new ResponseEntity("File Not Found", HttpStatus.NOT_FOUND);
        }

        // Setting up file path
        String filePath = fileUploadPath+File.separator+filename;

        // Creating new file instance
        File file = new File(filePath);

        // Creating new InputStreamResource object
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

        // Creating a new instance of HttpHeaders Object
        HttpHeaders httpHeaders = new HttpHeaders();

        // Setting up values for contentType and headerValue
        String contentType = "multipart/form-data";
        String headerValue = "attachment; filename=\"" + resource.getFilename() + "\"";

        return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION,headerValue)
                .body(resource);
    }

}
