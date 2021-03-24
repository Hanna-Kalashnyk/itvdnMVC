package com.filterMVC.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldPlusNameController {
    @RequestMapping(path = "/getname", method = RequestMethod.GET)
    public String getHelloWorldPlusName(@RequestParam(value = "name", required = false,defaultValue = "world")String name) {
        return "Hello, " +name;
    }
}