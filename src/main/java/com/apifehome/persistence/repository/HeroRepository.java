package com.apifehome.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apifehome.persistence.entity.Hero;

public interface HeroRepository extends JpaRepository<Hero, Long>{
    
}
