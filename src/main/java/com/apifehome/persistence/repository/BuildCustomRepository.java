package com.apifehome.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apifehome.persistence.entity.BuildCustom;

public interface BuildCustomRepository extends JpaRepository<BuildCustom, Long> {
    
}
