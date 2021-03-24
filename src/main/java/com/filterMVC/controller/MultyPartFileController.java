package com.filterMVC.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class MultyPartFileController {
    @GetMapping("/file")
    public ResponseEntity doSthWithFile(@RequestParam("file") MultipartFile file){
        return new ResponseEntity(file, HttpStatus.OK);
    }

}