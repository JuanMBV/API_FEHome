package com.apifehome.demo.service;

import com.apifehome.persistence.repository.HeroRepository;

public class HeroService {
    private final HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository){
        this.heroRepository = heroRepository;
    }
}
