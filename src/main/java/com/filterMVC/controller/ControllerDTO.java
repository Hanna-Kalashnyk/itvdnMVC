package com.filterMVC.controller;

import com.filterMVC.dtos.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerDTO {
//    @RequestMapping(path = "/getname", method = RequestMethod.GET)
//    public String getHelloWorldPlusName(@RequestParam(value = "name", required = false,defaultValue = "world")String name) {
//        return "Hello, " +name;
//    }

    @RequestMapping(path = "/getuser", method = RequestMethod.GET)
    public UserDTO getInfo(@RequestParam(value = "name", required = false, defaultValue = "world") String name) {
        return new UserDTO(1, "Kolya");
    }

    @GetMapping("/param")
    public ResponseEntity RequestParam(@RequestParam("id") long id, @RequestParam("name") String name){
        return new ResponseEntity(new UserDTO(id,name), HttpStatus.OK);
    }

    @GetMapping("/param/{id}/{name}")
    public ResponseEntity pathVariable(@PathVariable("id")long id,@PathVariable("name") String name){
        return new ResponseEntity(new UserDTO(id,name), HttpStatus.OK);
    }


}
