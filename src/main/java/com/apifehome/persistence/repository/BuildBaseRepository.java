package com.apifehome.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apifehome.persistence.entity.BuildBase;

public interface BuildBaseRepository extends JpaRepository<BuildBase, Long>{
    
}
