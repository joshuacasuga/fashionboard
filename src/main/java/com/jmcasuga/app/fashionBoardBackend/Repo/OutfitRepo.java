package com.jmcasuga.app.fashionBoardBackend.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jmcasuga.app.fashionBoardBackend.Models.Outfit;

public interface OutfitRepo extends JpaRepository<Outfit, Long> {
    
}
