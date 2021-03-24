package com.filterMVC.dtos;

public class UserDTO {
    long id;
    String name;


    public UserDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
