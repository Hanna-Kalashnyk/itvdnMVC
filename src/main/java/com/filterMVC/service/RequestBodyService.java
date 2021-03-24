package com.filterMVC.service;

import com.filterMVC.dtos.ConcatinateRBodyResponse;
import com.filterMVC.dtos.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class RequestBodyService {
    public ConcatinateRBodyResponse concatinationNameAndId(UserDTO userDTO) {
        String nameWithId = userDTO.getName() + userDTO.getId();
        return new ConcatinateRBodyResponse(nameWithId);
    }
}
