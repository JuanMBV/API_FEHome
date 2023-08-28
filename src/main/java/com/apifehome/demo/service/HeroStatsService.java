package com.apifehome.demo.service;

import com.apifehome.persistence.repository.HeroStatsRepository;

public class HeroStatsService {
    private final HeroStatsRepository heroStatsRepository;

    public HeroStatsService(HeroStatsRepository heroStatsRepository){
        this.heroStatsRepository = heroStatsRepository;
    }
}
