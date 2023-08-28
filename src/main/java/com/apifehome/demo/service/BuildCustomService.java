package com.apifehome.demo.service;

import com.apifehome.persistence.repository.BuildCustomRepository;

public class BuildCustomService {
    private final BuildCustomRepository buildCustomRepository;

    public BuildCustomService(BuildCustomRepository buildCustomRepository){
        this.buildCustomRepository = buildCustomRepository;
    }
}
