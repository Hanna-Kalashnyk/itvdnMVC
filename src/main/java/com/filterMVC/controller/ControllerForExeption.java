package com.filterMVC.controller;

import com.filterMVC.exception.SecondTestException;
import com.filterMVC.exception.FirstTestException;
import com.filterMVC.exception.ThirdTestException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerForExeption {

    @GetMapping("/first")
    public void firstTest() throws FirstTestException {
        throw new FirstTestException();
    }
    @GetMapping("/second")
    public void secondTest() throws SecondTestException {
        throw new SecondTestException();
    }
    @GetMapping("/third")
    public void thirdTest() throws ThirdTestException {
        throw new ThirdTestException();
    }
}
