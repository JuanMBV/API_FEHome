package com.apifehome.demo.service;

import com.apifehome.persistence.repository.PassiveRepository;

public class PassiveService {
    private final PassiveRepository passiveRepository;

    public PassiveService(PassiveRepository passiveRepository){
        this.passiveRepository = passiveRepository;
    }
}