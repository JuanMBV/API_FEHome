package com.apifehome.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apifehome.persistence.entity.Assist;

public interface AssistRepository extends JpaRepository<Assist, Long> {
    
}
