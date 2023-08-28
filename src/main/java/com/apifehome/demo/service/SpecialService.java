package com.apifehome.demo.service;

import com.apifehome.persistence.repository.SpecialRepository;

public class SpecialService {
    private final SpecialRepository specialRepository;

    public SpecialService(SpecialRepository specialRepository){
        this.specialRepository = specialRepository;
    }
}