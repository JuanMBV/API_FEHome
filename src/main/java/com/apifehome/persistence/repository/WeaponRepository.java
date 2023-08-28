package com.apifehome.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apifehome.persistence.entity.Weapon;

public interface WeaponRepository extends JpaRepository<Weapon, Long>{
    
}
