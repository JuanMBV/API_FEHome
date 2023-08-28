package com.apifehome.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apifehome.persistence.entity.HeroStats;

public interface HeroStatsRepository extends JpaRepository<HeroStats, Long>{
    
}
