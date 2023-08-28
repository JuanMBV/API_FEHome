package com.apifehome.demo.service;

import com.apifehome.persistence.repository.BuildBaseRepository;

public class BuildBaseService {
    private final BuildBaseRepository buildBaseRepository;

    public BuildBaseService(BuildBaseRepository buildBaseRepository){
        this.buildBaseRepository = buildBaseRepository;
    }
}
