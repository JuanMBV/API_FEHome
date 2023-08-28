package com.apifehome.demo.service;

import com.apifehome.persistence.repository.AssistRepository;

public class AssistService {
    private final AssistRepository assistRepository;

    public AssistService(AssistRepository assistRepository){
        this.assistRepository = assistRepository;
    }
}
