package com.filterMVC.dtos;

public class ConcatinateRBodyResponse {
    private String nameWithId;

    public ConcatinateRBodyResponse(String nameWithId) {
        this.nameWithId = nameWithId;
    }

    public String getNameWithId() {
        return nameWithId;
    }
}
