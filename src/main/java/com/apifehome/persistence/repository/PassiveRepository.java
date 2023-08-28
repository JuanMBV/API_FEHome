package com.apifehome.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apifehome.persistence.entity.Passive;

public interface PassiveRepository extends JpaRepository<Passive, Long>{
    
}
