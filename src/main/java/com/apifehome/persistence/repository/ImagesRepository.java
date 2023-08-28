package com.apifehome.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apifehome.persistence.entity.Images;

public interface ImagesRepository extends JpaRepository<Images, Long>{
    
}
