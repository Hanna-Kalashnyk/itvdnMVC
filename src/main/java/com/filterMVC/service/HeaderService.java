package com.filterMVC.service;

import org.springframework.stereotype.Service;

@Service
public class HeaderService {


    public String addStringToHeader(String header) {
        return header + "rendered";
    }
}
