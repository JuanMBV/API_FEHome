package com.apifehome.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apifehome.persistence.entity.WeaponEffect;

public interface WeaponEffectRepository extends JpaRepository<WeaponEffect, Long>{
    
}
