package com.filterMVC.controller;

import com.filterMVC.service.HeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeadersController {
    @Autowired
    HeaderService headerService;
    @GetMapping("/headers")
    public ResponseEntity doWithHeader(@RequestHeader("TEST")String header){
                return  new ResponseEntity(headerService.addStringToHeader(header), HttpStatus.OK);
    }
}
