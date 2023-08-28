package com.apifehome.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apifehome.persistence.entity.Special;

public interface SpecialRepository extends JpaRepository<Special, Long>{
    
}
