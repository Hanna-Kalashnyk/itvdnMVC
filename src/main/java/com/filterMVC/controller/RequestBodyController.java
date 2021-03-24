package com.filterMVC.controller;

import com.filterMVC.dtos.UserDTO;
import com.filterMVC.service.RequestBodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestBodyController {
@Autowired
    private RequestBodyService requestBodyService;

@GetMapping("/body")
    public ResponseEntity makeResponseWithIDNameConcatination(@RequestBody UserDTO userDTO){
    return new ResponseEntity(requestBodyService.concatinationNameAndId(userDTO), HttpStatus.OK);
    }

}
